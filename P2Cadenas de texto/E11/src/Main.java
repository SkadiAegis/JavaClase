import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//define un hashset de 10 numeros aleatorios y ordenalo por su valor
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            hs.add((int) (Math.random() * 100));
        }
        System.out.println("Valores aleatorios sin ordenar");
        hs.forEach((s) -> {
            System.out.println(s);
        });
        System.out.println("Valores aleatorios ordenados");
        TreeSet myTreeSet = new TreeSet();
        myTreeSet.addAll(hs);
        System.out.println(myTreeSet);
    }
}