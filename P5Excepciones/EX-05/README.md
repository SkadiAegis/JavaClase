# README

### Ejercicio 5: Propón y soluciona un ejercicio que trabaje las excepciones.

Mi ejercicio es el siguiente:

Pide al usuario una palabra que puede contener numeros, contar cuantas rapeticiones de cada letra hay y de cada numero. En caso de que un numero se repita mas de una vez lanzar una excepcion. Las letras no tienen limite de repeticiones.

#### Classe: Main
```java
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
```

#### Classe: NumberRepeated

```java
public class NumberRepeated extends Exception {
    public NumberRepeated() {
        super();
    }

    public NumberRepeated(String message) {
        super(message);
    }
}
```

#### Classe: ComprobarSiNumeroSeRepite

```java
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
```

## Dificultades

Ha costado encontrar como poder introducir en un HashMap un Key y un Value y despues poder comprobar si un Value era un numero o no.


## Funcionalidades no conseguidas

Todas las funcionalidades han sido conseguidas.