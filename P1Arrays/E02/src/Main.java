import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] lDni = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        Scanner sc= new Scanner(System.in);
        int numero_dni = sc.nextInt();
        System.out.println("La letra del dni es: "+lDni[(numero_dni % 23)]);
    }
}