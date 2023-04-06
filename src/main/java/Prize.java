public class Prize {
    private int ID;
    private String name;
    private int winning;

    public int getWinning() {
        return winning;
    }

    public Prize(int ID, String name, int winning) {
        this.ID = ID;
        this.name = name;
        this.winning = winning;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return ("Игрушка № %d, имя - %s").formatted(this.getID(), this.getName());
    }
}
