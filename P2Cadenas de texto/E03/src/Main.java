import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la palabra");
        String palabra = sc.nextLine();
        System.out.println("Introduce un caracter a buscar");
        char caracter = sc.next().charAt(0);
        pos_letra(palabra, caracter);

    }
    public static void pos_letra(String palabra, char caracter){
        int pos_letra=0;
        for (int i=0;i<palabra.length();i++){
            if (palabra.charAt(i)==caracter){
                pos_letra=i;
                System.out.println("La posicion de la letra " + caracter +" es " + pos_letra);
            }
        }

    }
}
