import java.util. ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("Este");
        al.add("es");
        al.add("un");
        al.add("ejemplo");
        al.add("de");
        al.add("ArrayList");
        Iterator it = al.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}