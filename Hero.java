public class Hero {
    String name;
    int lvl;
    Weapon weapon;
    Armor armor;
    public Hero(String name, int lvl, Weapon weapon, Armor armor){
        this.name = name;
        this.lvl = lvl;
        this.weapon = weapon;
        this.armor = armor;
    }
    public String toString(){
        return name + "\n" + lvl + "\n" + weapon + "\n" + armor;
    }
}
