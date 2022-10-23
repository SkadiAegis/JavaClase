public class Main {
    public static void main(String[] args) {

        StackArray<Integer> stack = new StackArray<Integer>(); //Crea un objeto de la clase StackArray
        stack.add(1); //Añadimos los elementos al array
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);

        System.out.println(stack.toString());
        System.out.println(stack.getFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.isEmpty());
        System.out.println(stack.toString());
    }
}