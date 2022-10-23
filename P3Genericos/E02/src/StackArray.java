import java.util.LinkedList;

public class StackArray<T> {
    private T[] array; //Crea array tipo T (T puede ser cualquier tipo de dato)
    private int contador; //contador de elementos en el array

    public StackArray() { //Constructor que inicializa el array a 10 posiciones
        array = (T[]) new Object[10];
        contador = 0;
    }

    public boolean isEmpty() { //Comprueba si el valor del contador es 0
        return contador == 0;
    }

    public T removeFirst() { //Elimina el primer elemento del array
        if (isEmpty()) { //Si el array está vacío, devuelve null y no prosigue con el resto del código
            return null;
        }
        T first = array[0]; //Recoje el primer elemento del array para mostrarlo por pantalla despues
        for (int i = 0; i < contador - 1; i++) { //Recorre el array cambianod cada elemento por el siguiente (el primero pasa a ser
            array[i] = array[i + 1]; //el segundo, el segundo pasa a ser el tercero, etc)
        }
        contador--; //Resta 1 al contador
        return first;
    }

    public T getFirst() {
        if (isEmpty()) {//Si esta vacio devuelve null y no prosigue con el resto del código
            return null;
        }
        return array[0]; //Devuelve el primer elemento del array
    }

    public void add(T elemento) { //Añade un elemento al array
        if (contador == array.length) { //Si el contador es igual al tamaño del array, se crea un nuevo array con el doble de tamaño
            T[] newArray = (T[]) new Object[array.length * 2]; //Crear el array nuevo con el doble de tamaño
            for (int i = 0; i < array.length; i++) {//pasar todo el contenido del array antiguo al nuevo
                newArray[i] = array[i];
            }
            array = newArray; //El array antiguo pasa a ser el nuevo
        }
        array[contador] = elemento; //Añade el elemento nuevo al array
        contador++;
    }

    public String toString() { //Muestra el contenido del array
        String result = ""; //dentro de este string se irá añadiendo el contenido del array
        for (int i = 0; i < contador; i++) { //recorre el array añadiendo cada elemento al string
            result += array[i] + ", ";
        }
        return result;
    }
}

