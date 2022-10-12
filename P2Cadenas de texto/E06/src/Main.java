public class Main {
    public static void main(String[] args) {
        String CadenasDeTextoYColeccionables = "Cadenas de texto y coleccionables";
        int letra;
        for (int i=0;i< CadenasDeTextoYColeccionables.length();i++){
            letra = CadenasDeTextoYColeccionables.charAt(i);
            System.out.println("ASCII: " + letra + " es equivalente a: " +CadenasDeTextoYColeccionables.charAt(i));
        }
    }
}