public class Armor {
    String type;
    int defense;
    public Armor(String type, int defense){
        this.type = type;
        this.defense = defense;
    }
    public String toString() {
        return type + "\n" + defense;
    }
}
