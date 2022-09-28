import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int nPositivos =0;
        int nNegativos =0;
        int nSonCero=0;
        for (int i=0;i<numeros.length;i++) {
            System.out.println("Introduza el numero");
            numeros[i]=sc.nextInt();
        }

        for (int i: numeros) {
            System.out.print(i);
            if (i<0) nNegativos++;
            if (i==0) nSonCero++;
            if (i>0) nPositivos++;
        }
        System.out.println("\nCantidad de numeros sobre 0 = "+nPositivos + "\n Cantidad de numeros bajo 0 = "+nNegativos + "\n Cantidad de numeros que son 0 = "+nSonCero);
    }
}