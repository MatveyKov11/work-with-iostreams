import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task3 {
    public static Hero load(String path) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(path));
        String name = bf.readLine();
        int lvl = Integer.valueOf(bf.readLine());
        String t1 = bf.readLine();
        int damage = Integer.valueOf(bf.readLine());
        String t2 = bf.readLine();
        int defense = Integer.valueOf(bf.readLine());
        bf.close();
        return new Hero(name, lvl, new Weapon(t1, damage), new Armor(t2, defense));
    }
    public static void save(Hero hero, String path) throws IOException {
        FileWriter fw = new FileWriter(path);
        fw.write(hero.toString());
        fw.close();
    }
    public static void main(String[] args) throws IOException {
        Hero h1 = new Hero("Newbie", 1, new Weapon("Stick", 1), new Armor("Shirt", 0));
        save(h1, "h1.txt");
        Hero h2 = load("h2.txt");
        System.out.println(h2);
    }
}
