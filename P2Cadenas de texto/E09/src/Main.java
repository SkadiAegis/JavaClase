import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List milista = new ArrayList();
        milista.add("Elemento1");
        milista.add("Elemento2");
        String[] miarray = new  String[milista.size()];
        miarray = (String[])milista.toArray(miarray);
        for (int i = 0; i < miarray.length; i++) {
            System.out.println(miarray[i]);
        }


    }
}