import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray("a=", a);
        testPrintArray();
        int[] a4 = randomArray(30, -5, 5);
        printArray("a4 = ", a4);
        printArray("-1 bis +1: ", randomArray(10, -1, 1));
        printArray("+1 bis +3: ", randomArray(10, 1, 3));
        printArray("-3 bis -1: ", randomArray(10, -3, -1));
        printArray("leer: ", randomArray(0, -3, -1));
        System.out.println();
        System.out.println("getMaximum() = " + getMaximum(a));
        System.out.println("getMinimum(a) = " + getMinimum(a));
        System.out.println("getMittelwert() = " + getMittelwert(a));
        System.out.println("getSumme(a) = " + getSumme(a));

    }

    public static int random(int min, int max) {
        return min + (int) ((max - min + 1) * Math.random());
    }

    public static void printArray(String msg, int[] a) {
        System.out.println(msg + "{" + Arrays.toString(a).substring(1, Arrays.toString(a).length() - 1) + "}");
    }


    public static void testPrintArray() {
        int[] a1 = new int[25];
        for (int i = 0; i < 25; i++) {
            a1[i] = 1 + i;
        }
        printArray("a1=", a1);

        int[] a2 = new int[20];
        for (int i = 0; i < 20; i++) {
            a2[i] = (i + 1) * 5;
        }
        printArray("a2=",a2);

        int[] a3 = new int[20];
        for (int i = 0; i < 11; i++) {
            a3[i] = i - 5;
        }
        printArray("a3=", a3);


        int[] aLeer = {};
        printArray("aLeer=", aLeer);
    }

    public static int[] randomArray(int len, int min, int max) {
        int[] rInt = new int[len];
        for (int i = 0; i < len; i++) {
            rInt[i] = random(min, max);
        }
        return rInt;
    }

    public static int getMaximum(int[] a) {
        int rInt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > rInt) {
                rInt = a[i];
            }
        }
        return rInt;
    }

    public static int getMinimum(int[] a) {
        int rInt = getMaximum(a);
        for (int i = a.length - 1; i >= 0; i++) {

        }
        return rInt;
    }

    public static int getSumme(int[] a) {
        int rInt = 0;
        for (int i : a) {
            rInt += i;
        }
        return rInt;
    }

    public static double getMittelwert(int[] a) {
        int rInt = 0;
        for (int i : a) {
            rInt += i;
        }
        return rInt/a.length;
    }
}