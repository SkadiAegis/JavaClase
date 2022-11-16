# README

## Explicacion Del Codigo:

El codigo esta explicado en comentarios dentro del codigo

### Ejercicio 2: ¿Qué tiene de especial la excepción del tipo “RuntimeException”?

RuntimeException es una clase que representa las excepciones que suceden dentro de la maquina virtual Java mientras se esta ejecutando.

Se pueden capturar las excepciones RuntimeException igual que las demas. Sin embargo, no se require que un método especifico que lanza excepciones en tiempo de 
ejecución.


### Ejercicio 3: Escribe un código que genere y capture una excepción al sobrepasar el límite de un array. Añada el código a la tabla


```java 
public class Main {
    public static void main(String[] args) {
        int[] a = new int[2]; //creo un array de 2 elementos
        try {
            //le añado 3 elementos
            a[0] = 1;
            a[1] = 2;
            a[2] = 3;
        }catch (ArrayIndexOutOfBoundsException e) { //capturo el error de sobrepasar el limite del array
            System.out.println("array lleno"); //si falla (que lo hara) imprime "array lleno"
        }
    }
} 
```

### Ejercicio 4: Crea un programa con un bucle while que pida al usuario un número entero y muestre el resultado del cuadrado. En caso de introducir un carácter o valor que no sea un número, captura la excepción y vuelva a pedirle el número hasta que sea correcto. Añada el código a la tabla

#### Classe Main

```java
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
```

#### Classe InputMismatch

```java
public class InputMismatchException extends Exception {
    public InputMismatchException() {super();
    }

    public InputMismatchException(String message) {
        super(message);
    }
}
```

#### Classe ComprobarInput

```java
public class ComprobarInput {
    public static boolean Comprobar(String input) throws InputMismatchException {
        try {
            int numero = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            throw new InputMismatchException("El input no es un numero");
        }

    }
}
```


## Dificultades

En el segundo ejercicio he echo dos versiones ya que pensaba que tenia que crear una nueva excepcion igual que el primer ejercicio (la primera version en la que me complique de mas es la carpeta EX_03 la segunda version mas simple es EX_03_V2)


## Funcionalidades no conseguidas

Todas las funcionalidades han sido conseguidas.