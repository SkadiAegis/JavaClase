import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre y apellido");
        String nombre_completo = sc.nextLine();
        String apellidos = nombre_completo.substring(pos_primer_espacio(nombre_completo));
        System.out.println(apellidos + ", " +nombre_completo.charAt(0));
    }
    public static int pos_primer_espacio(String nombre_completo){
        int pos_espacio=0;
        for (int i=0;i<nombre_completo.length();i++){
            if (nombre_completo.charAt(i)==' '){
                pos_espacio=i; break;
            }
        }
        return pos_espacio;
    }
}