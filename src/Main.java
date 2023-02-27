import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        printArray("a=", a);
        testPrintArray();
    }

    public static void printArray(String msg, int[] a){
        System.out.println(msg +"{"+ Arrays.toString(a).substring(1,Arrays.toString(a).length()-1)+"}");
    }


    public static void testPrintArray(){
        int[] a1 = new int[25];
        for (int i = 0; i < 25; i++) {
            a1[i]=1+i;
        }
        printArray("a1=",a1);

        int[] a2 = new int[20];
        for (int i = 0; i < 20; i++) {
            a2[i]=(i+1)*5;
        }
        printArray("a2=",a2);

        int[] a3 = new int[20];
        for (int i = 0; i < 11; i++) {
            a3[i]=i-5;
        }
        printArray("a3=",a3);


        int[] aLeer = {};
        printArray("aLeer=",aLeer);
    }
}