public class Array<T> {
    private T[] array; //Crea array tipo T (T puede ser cualquier tipo de dato)
    private static int contador; //contador de elementos en el array

    public Array(int i) { //Con este metodo creo el array
        array = (T[]) new Object[i];
        contador = 0;
    }

    public static <T> boolean ArrayComprobar(T[] array) throws ArrayLimitException { //Comprueba si el array esta lleno
        if (array.length < contador+1 ){
            throw new ArrayLimitException("El array no puede tener mas de "+(contador)+" elementos");//En caso de que este lleno, lanza la excepcion
        }else {
            return true; //Si no esta lleno, devuelve true
        }
    }

    public void add(T elemento) throws ArrayLimitException { //Añade un elemento al array
        if (ArrayComprobar(array)) {//Comprueba si el array esta lleno
            array[contador] = elemento;
            contador++;
        }
    }
}

