import java.util.Map;

public class ComprobarSiNumeroSeRepite {
    public static void Comprobar(Map<Character, Integer> mapa) throws NumberRepeated { //Creo un metodo que recibe un mapa y devuelve un booleano
        for (Map.Entry<Character, Integer> entry : mapa.entrySet()) { //Recorro el mapa con un for each
            if (entry.getValue() > 1 && Character.isDigit(entry.getKey())) { //Si el valor de la clave es mayor que 1 y la clave es un numero
                throw new NumberRepeated("El numero " + entry.getKey() + " se repite " + entry.getValue() + " veces"); //Lanzo una excepcion NumberRepeated
            }
        }
    }
}
