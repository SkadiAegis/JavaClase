import java.util.ArrayList;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la primera palabra");
        String palabra1 = sc.nextLine();
        System.out.println("Escibe la segunda palabra");
        String palabra2 = sc.nextLine();
        palabra1=palabra1.replaceAll("\\s+","");
        palabra2=palabra2.replaceAll("\\s+","");


        for (int i=0; i<PalabraMaslarga(palabra1, palabra2);i++){;
            if (i<palabra1.length()){
                System.out.print(palabra1.charAt(i));
            }else break;

            if (i<palabra2.length()){
                System.out.print(palabra2.charAt(i));
            }else break;
        }
    }
    public static int PalabraMaslarga(String palabra1, String palabra2){
        int palabraMasLarga=0;
        if (palabra1.length()>palabra2.length()){
            palabraMasLarga=palabra1.length();
        }else{
            palabraMasLarga=palabra2.length();
        }
        return palabraMasLarga;
    }
}