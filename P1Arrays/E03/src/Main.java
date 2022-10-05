public class Main {
    public static void main(String[] args) {
        int[][] numerosAleatorios = new int[4][5];
        int[] FilaSumada = new int[4];
        int[] ColumnaSumada = new int[5];
        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                numerosAleatorios[i][j] = (int) (Math.random() * 10);
                FilaSumada[i] += numerosAleatorios[i][j];
                ColumnaSumada[j] += numerosAleatorios[i][j];
                sumaTotal += numerosAleatorios[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println("| " + FilaSumada[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("----");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(ColumnaSumada[i] + " ");
        }
        System.out.println("| " + sumaTotal);
    }
}
