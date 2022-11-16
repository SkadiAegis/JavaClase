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