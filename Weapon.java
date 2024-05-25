public class Weapon {
    String type;
    int damage;
    public Weapon(String type, int damage){
        this.type = type;
        this.damage = damage;
    }
    public String toString(){
        return type + "\n" + damage;
    }
}
