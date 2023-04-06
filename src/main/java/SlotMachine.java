import java.util.Iterator;
import  java.util.PriorityQueue;

public class SlotMachine implements Iterator<Prize> {
    int index;
    private PriorityQueue<Prize> slotMachine;

    public SlotMachine() {
        slotMachine = new PriorityQueue<>((a, b) -> b.getWinning() - a.getWinning());
    }
    public Object[] ToArray () {
        return slotMachine.toArray();
    }

    public void PutData(Prize data) {
        slotMachine.add(data);
    }

    public int Getsize() {
        return slotMachine.size();
    }

    @Override
    public boolean hasNext() {
        return index < slotMachine.size();
    }

    @Override
    public Prize next() {
        return slotMachine.poll();
    }

}