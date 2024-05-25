import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Borodino.txt"));
        FileWriter fw = new FileWriter("BorodinoTrim.txt");
        while (br.ready()){
            String s = br.readLine();
            int i = 0;
            while (i < s.length()){
                if(s.charAt(i) ==  ' '){
                    fw.write(' ');
                    while (i < s.length() && s.charAt(i) == ' '){
                        i++;
                    }
                }else {
                    fw.write(s.charAt(i));
                    i++;
                }
            }
            fw.write('\n');
        }
        br.close();
        fw.close();
    }
}
