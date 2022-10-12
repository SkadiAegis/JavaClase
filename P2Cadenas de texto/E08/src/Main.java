import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Este");
        al.add("es");
        al.add("un");
        al.add("ejemplo");
        al.add("de");
        al.add("ArrayList");
        
        al.forEach((s) -> {
            System.out.println(s);
        });


    }
}