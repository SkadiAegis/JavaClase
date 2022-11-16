public class Main {
    public static void main(String[] args) {
        try {
            GuardarNumeros.comprobarNegativo(-1); //Llamo al metodo de la clase GuardarNumeros
        } catch (NegativeNumberException e) {
            throw new RuntimeException(e);
        }
    }
}