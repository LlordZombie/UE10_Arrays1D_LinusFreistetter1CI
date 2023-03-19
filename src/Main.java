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
        printArray("a9: ", a9); // Ausgabe: a9: {99, 7, 19, 18}
        System.out.println();
        int[] toSort = randomArray(25, 100, 999);
        reverseSort(toSort);
        printArray("tosort:", toSort);
        System.out.println();
        int[] aOriginal = {1, 1, 1, 2, 2, 2, 0};
        int[] aOhneDoppelte = deleteEquals(aOriginal);
        printArray("aOhneDoppelte = ", aOhneDoppelte);
        printArray("getprimes5", getPrimes(5));
        System.out.println();
        printArray("getPrimfaktoren von 2000",getPrimfaktoren(2000));
        System.out.println();
        String[] hallo = {"hallo","hallo","hallo","hallo","hallo"};
        printArray("hallo:",hallo);
        printArray("countSelbstLuate(: \"BANANEN sind besonders gesund\")",countSelbstlaute( "BANANEN sind besonders gesund"));
        System.out.println();
        printArray("charStatistik",charStatistik("Fünf mal Zwölf = 5 * 12 = 60"));
    }

    public static boolean contains(int[] a, int search) {
        for (int j : a) {
            if (j == search) {
                return true;
            }
        }
        return false;
    }

    public static int random(int min, int max) {
        return min + (int) ((max - min + 1) * Math.random());
    }

    public static void printArray(String msg, int[] a) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(", ");
            }
        }
        System.out.println(msg + "{" + s + "}");
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


    public static void reverseSort(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    public static int[] deleteEquals(int[] a) {
        int[] rInt = new int[a.length];
        int counter = 0;
        for (int j : a) {
            if (!contains(rInt, j)) {
                rInt[counter] = j;
                counter++;
            }
        }
        if (contains(a, 0)) {
            rInt = resize(rInt, counter + 1);
        } else {
            rInt = resize(rInt, counter);
        }
        return rInt;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static int[] getPrimes(int k) {
        if (k <= 0) {
            return new int[]{0};
        }
        int[] rInt = new int[k];
        int counter = 0;
        for (int i = 0; counter < k; i++) {
            if (isPrime(i)) {
                rInt[counter] = i;
                counter++;
            }
        }
        return rInt;
    }

    public static int[] getPrimesByBiggest(int k) {
        if (k <= 0) {
            return new int[]{0};
        }
        int[] rInt = new int[k];
        int counter = 0;
        for (int i = 1; i < k; i++) {
            if (isPrime(i)) {
                rInt[counter] = i;
                counter++;
            }
        }
        return rInt;
    }

    public static int[] getPrimfaktoren(int n){
        int[] p = getPrimesByBiggest((n/2)+1);
        int[] rInt = new int[n];
        int counter = 0;
        int i = 0;
        while (n>1){
            if (n%p[counter]==0){
                rInt[i]=p[counter];
                i++;
                n/=p[counter];
            }else{
                counter++;
            }


        } int len = indexOf(rInt,0);
        return resize(rInt,len);
    }

    public static int[] haeufigkeitenBeimWuerfeln(int anzWuerfel, int versuche){
        int[] r = new int[1+6*anzWuerfel];
        int min = 1;
        int max = 6;

        r[0] = anzWuerfel;
        for (int i = 0; i < versuche ; i++) {
            int rnNr = 0;
            for(int j = 0; j < anzWuerfel; j++) {
                rnNr += min + (int) ((max - min + 1) *Math.random());
            }
            r[rnNr]++;
        }

        return r;
    }


    public static int[] wahrscheinlichkeitenBeimWuerfeln(int anzWuerfel, int versuche){
        int[] a = haeufigkeitenBeimWuerfeln(anzWuerfel, versuche);
        int[] r = new int[1+anzWuerfel*6];
        r[0] = anzWuerfel;

        for (int i = 1; i < r.length; i++) {
            double j = 1;
            j*= ((double) a[i])/((double) versuche);
            j *= 1000;
            r[i] = doubleToIntApro(j);
        }

        return r;
    }

    public static int doubleToIntApro(double d){
        int r;

        if((d - (int) d) < 0.5){
            r = (int) d;
        }else{
            r = (int) d + 1;
        }

        return r;
    }

    public static void printArray(String msg, String[] a){
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(", ");
            }
        }
        System.out.println(msg + "{" + s + "}");

    }

    public static int[] countSelbstlaute(String text){
        int[] counter = new int[5];
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case 'a', 'A' -> counter[0]++;
                case 'e', 'E' -> counter[1]++;
                case 'i', 'I' -> counter[2]++;
                case 'o', 'O' -> counter[3]++;
                case 'u', 'U' -> counter[4]++;
            }
        }
        return counter;
    }

    public static int isSelbstlautOrUmlautOrMitlaut(char ch){


        if (Character.isLetter(ch)){
            if (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
                return 0;
            }else if (ch=='ä'||ch=='Ä'||ch=='ö'||ch=='Ö'||ch=='ü'||ch=='Ü'){
                return 1;
            } else {
                return 2;
            }
        }else {
            return -1;
        }

    }


    public static int[] charStatistik(String text){
        int[] counter = new int[5];

        for (int i = 0; i < text.length(); i++) {
            if (isSelbstlautOrUmlautOrMitlaut(text.charAt(i))==0){
                counter[0]++;
            } else if (isSelbstlautOrUmlautOrMitlaut(text.charAt(i))==1) {
                counter[1]++;
            } else if (isSelbstlautOrUmlautOrMitlaut(text.charAt(i))==2) {
                counter[2]++;
            } else if (isSelbstlautOrUmlautOrMitlaut(text.charAt(i))==-1) {
                if (Character.isDigit(text.charAt(i))){
                    counter[3]++;
                }else {
                    counter[4]++;
                }
            }

        }return counter;
    }

}