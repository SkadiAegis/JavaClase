import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        Stack.add(list, "Hola");
        Stack.add(list, "Adios");
        Stack.add(list, "Pepe");
        Stack.add(list, "Juan");
        Stack.add(list, "Maria");



        if (Stack.isEmpty(list)) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }

        System.out.println(Stack.removeFirst(list));

        System.out.println(Stack.getFirst(list));

        System.out.println(Stack.toString(list));

    }
}
