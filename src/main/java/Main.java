import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Prize> collect = new ArrayList();
        collect.add(new Prize(1, "Мишка", 20));
        collect.add(new Prize(2, "Феня", 20));
        collect.add(new Prize(3, "Барбос", 60));
        SlotMachine machine = new SlotMachine();
        for(int i = 0; i <= 20; i++) {
            Random random = new Random();
            int number = random.ints(0, 3).findFirst().getAsInt();
            Prize data = collect.get(number);
            machine.PutData(data);
        }
        for (int i = 0; i < 10; i++){
            String getPrize = String.valueOf(machine.next());
            try(FileWriter writer = new FileWriter("prize.txt", true))
            {
                writer.write(getPrize);
                writer.write('\n');
                writer.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}













