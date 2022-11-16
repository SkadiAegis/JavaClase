import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Input = sc.nextLine();
        while (true) {
            try {
                int numero = Integer.parseInt(Input);
                System.out.println(numero * numero);
                break;
            } catch (NumberFormatException e) {
                System.out.println("El input no es un numero");
                Input = sc.nextLine();
            }
        }

    }
}