import java.util.LinkedList;


public class Stack<T> {


    private T t; //La T mayuscula es para indicar que tipo de variable es (Int, double, String, etc)
    public Stack(T t) {
        this.t=t;
    } //Constructor que recibe una variable de tipo T y la asigna a la variable t

    public static <T> boolean isEmpty(LinkedList<T> list) {
        return list.isEmpty();
    } //Recibe la lista de tipo T y devuelve true si esta vacia y false si no lo esta

    public static <T> T removeFirst(LinkedList<T> list) {
        return list.removeFirst();
    } //Recibe la lista de tipo T y devuelve el primer elemento de la lista y lo elimina de la lista

    public static <T> T getFirst(LinkedList<T> list) {
        return list.getFirst();
    } //Recibe la lista de tipo T y devuelve el primer elemento de la lista

    public static <T> void add(LinkedList<T> list, T element) {
        list.add(element);
    }//Recibe la lista de tipo T y un elemento de tipo T que se guarda en la variable t (se pasa asi Stack.add(nombreDeLaLista, lo que quieres añadir)) y lo añade a la lista

    public static <T> String toString(LinkedList<T> list) {
        return list.toString();
    } //Recibe la lista de tipo T y devuelve todos los elementos de la lista en forma de String
}
