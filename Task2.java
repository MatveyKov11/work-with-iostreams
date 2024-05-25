import java.io.*;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("listNames.txt"));
        FileWriter fw = new FileWriter("sortedNames.txt");
        TreeSet<String> l = new TreeSet<>();
        String name = "";
        while (br.ready()){
            String s = br.readLine();
            int i = 0;
            while (i < s.length()){
                if(s.toLowerCase().charAt(i) >= 'а' && s.toLowerCase().charAt(i) <= 'я'){
                    name += s.charAt(i);
                }else {
                    if(!name.equals("")){
                        l.add(name);
                        name = "";
                    }
                }
                i++;
            }
        }
        for(String s: l){
            fw.write(s + " ");
        }
        br.close();
        fw.close();
    }
}
