import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la palabra");
        String palabra = sc.nextLine();
        System.out.println("Introduce un caracter a buscar");
        char caracter = sc.next().charAt(0);
        int pos = palabra.indexOf(caracter);
        while (pos != -1) {
            System.out.println("La posicion de la letra " + caracter +" es " + pos);
            pos = palabra.indexOf(caracter, pos + 1);
        }
    }

}
