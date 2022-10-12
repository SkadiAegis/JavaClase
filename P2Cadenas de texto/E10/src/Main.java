import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
    HashSet<String> hs = new HashSet<String>();
        hs.add("Este");
        hs.add("es");
        hs.add("un");
        hs.add("ejemplo");
        hs.add("de");
        hs.add("HashSet");

        hs.forEach((s)->{
            System.out.println(s);
        });
    }
}