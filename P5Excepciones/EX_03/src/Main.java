public class Main {
    public static void main(String[] args) {
        Array<Integer> array = new Array<>(2);
        try {
            array.add(1);
            array.add(2);
            array.add(3);

        }catch (ArrayLimitException e) {
            throw new RuntimeException(e);
        }
    }
}