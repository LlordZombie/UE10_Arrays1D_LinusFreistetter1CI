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
        System.out.println();
        int[] aSource = {1, 2, 3};
        int[] aCopy = copy(aSource);
        aSource[0] = 99;
        printArray("aSource: ", aSource);
        printArray("aCopy : ", aCopy);
        System.out.println();
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 3};
        System.out.println(indexOf(b, 3));
        printArray("resize(a,11)=", resize(a, 11));
        System.out.println("indexOf(b,3,5) = " + indexOf(b, 3, 5));
        int[] a8 = {10, 0, 9};
        printArray("a8: ", a8); // Ausgabe: a8: {10, 0, 9}
        addNumber(a8, 100);
        printArray("a8+100: ", a8);
        System.out.println();
        boolean[] c = {true, true, false, true, false, true, true, true};
        int[] bFalseTrue = countFalseTrue(c);
        System.out.println("b: " + Arrays.toString(b) + "\nAnzahl der:");
        System.out.println("false-Werte von b: " + bFalseTrue[0]); // ... false-Werte von b: 2
        System.out.println("true -Werte von b: " + bFalseTrue[1]); // ... true -Werte von b: 6
        boolean[] b2 = stringToBooleanArray("I am");
        System.out.println(Arrays.toString(b2));
        int[] a9 = {19, 7, 99, 18};
        swap(a9, 0, 2);
        printArray ("a9: ", a9); // Ausgabe: a9: {99, 7, 19, 18}
        System.out.println();
        int[] toSort = randomArray(25,100,999);
        reverseSort(toSort);
        printArray("tosort:",toSort);
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
        printArray("a2=", a2);

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
        for (int j : a) {
            if (j > rInt) {
                rInt = j;
            }
        }
        return rInt;
    }

    public static int getMinimum(int[] a) {
        int rInt = getMaximum(a);
        for (int i = a.length - 1; i >= 0; i--) {
            if (rInt > a[i]) {
                rInt = a[i];
            }
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
        return rInt / a.length;
    }

    public static int[] copy(int[] source) {
        int[] rInts = new int[source.length];
        System.arraycopy(source, 0, rInts, 0, source.length);
        return rInts;
    }

    public static int indexOf(int[] a, int n) {
        int rInt = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                rInt = i;
                break;
            }
        }
        return rInt;
    }

    public static int[] resize(int[] a, int newLength) {
        int[] rInts = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            if (i >= a.length) {
                rInts[i] = 0;
            } else {
                rInts[i] = a[i];
            }
        }
        return rInts;
    }

    public static int indexOf(int[] a, int n, int pos) {
        int rInt = -1;
        for (int i = pos; i < a.length; i++) {
            if (a[i] == n) {
                rInt = i;
                break;
            }
        }
        return rInt;
    }

    public static void addNumber(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            a[i] += n;
        }
    }

    public static int[] countFalseTrue(boolean[] b) {
        int[] rInts = new int[2];
        for (boolean value : b) {
            if (value) {
                rInts[0]++;
            } else {
                rInts[1]++;
            }
        }
        return rInts;
    }

    public static boolean[] stringToBooleanArray(String s) {
        boolean[] rBoolean = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            rBoolean[i] = s.charAt(i) != ' ';
        }
        return rBoolean;
    }

    public static boolean equals(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRotatable(char[] a, char[] b) {
        int aLen = a.length;
        if (aLen != b.length) {
            return false;
        }

        FIRST_LOOP:
        for (int bOffset = 0; bOffset < aLen; bOffset++) {
            for (int i = 0; i < aLen; i++) {
                if (a[i] != b[(i+bOffset) % aLen]) {
                    continue FIRST_LOOP;
                }
            }
            return true;
        }
        return false;
    }


    public static void swap(int[] a, int i, int j){
        int intBeiI = a[i];
        int intBeiJ = a[j];
        a[i]= intBeiJ;
        a[j]= intBeiI;
    }

    public static int indexOfLargestElement(int[] a, int startPos){
        int rInt = a[0];
        for (int i = 0; i < startPos; i++) {
            if (a[i]>rInt){
                rInt=a[i];
            }
        }
        return rInt;
    }


    public static void reverseSort(int[] a){
        Arrays.sort(a);
        for (int i = 0; i < a.length/2; i++) {
            swap(a,i,a.length-i-1);
        }
    }
}