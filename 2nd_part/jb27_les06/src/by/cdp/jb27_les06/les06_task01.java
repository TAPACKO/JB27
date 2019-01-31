package by.cdp.jb27_les06;

public class les06_task01 {

    private static int k = 10;

    public static void main(String[] args) {

        Rational[] rationalArray = new Rational[k];
        rationalArray = fillArray(rationalArray);

        printArray(rationalArray);
    }

    public static Rational[] fillArray(Rational[] array) {
        for (int i = 0; i < k; i++) {
            array[i] = new Rational(i * 2, i * 3);
        }
        return array;
    }

    public static void printArray(Rational[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]=" + array[i]);
        }
    }
}
