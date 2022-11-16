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
