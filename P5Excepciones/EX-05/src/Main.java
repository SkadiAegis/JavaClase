import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Creo un objeto de la clase Scanner para poder leer el input del usuario
        Map<Character, Integer> mapa = new HashMap<>(); //Creo un mapa para poder guardar los numeros que se repiten
        String input = sc.nextLine(); //Leo el input del usuario
        while (true) { //
                char[] array = input.toCharArray(); //Convierto el input en un array de caracteres
                for (char c : array) { //Recorro el array de caracteres
                    if (mapa.containsKey(c)) { //Si el mapa contiene la clave c
                        mapa.put(c, mapa.get(c) + 1); //Añado 1 al valor de la clave c
                    } else { //Si no contiene la clave c
                        mapa.put(c, 1); //Añado la clave c con valor 1
                    }
                }
                System.out.println(mapa); //Imprimo el mapa
                break; //salgo del bucle
        }

        try {//Intento ejecutar el codigo
            ComprobarSiNumeroSeRepite.Comprobar(mapa);//Llamo al metodo Comprobar de la clase ComprobarSiNumeroSeRepite
        } catch (NumberRepeated e) {
            System.out.println(e.getMessage()); //Si se produce una excepcion NumberRepeated imprimo el mensaje de la excepcion
        }

    }
}