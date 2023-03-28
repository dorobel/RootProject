
import java.util.*;

public class Practice01 {
    public static void main(String[] args) { // arguments of type string

        arrays();
        methods();

    }

    public static void arrays() {

        // Ints

        final int[] intArray = new int[10];
        intArray[0] = 100;
        intArray[1] = 100;
        intArray[1] = 200; // change the value of an array
        System.out.println("Int array at index 0: " + intArray[0]);
        System.out.println("Int array at index 1: " + intArray[1]);
        System.out.println("Int array: " + Arrays.toString(intArray)); // list whole array

        final double[] doubleArray = { 100.34, 200.34, 300, 400.3, 500 };
        System.out.println("Int array at index 1: " + doubleArray[3]);

        Integer[] integerArray = { 45, 24 };
        System.out.println("Integer array at index 1: " + integerArray[1]);

        Number[] numArray = { 23, 45.34 };
        System.out.println("Number array at index 1: " + numArray[1]);

        // Chars

        char[] charArray = { 'd', 'e', 'c', 'a', 't', 'e', 'd', 'p' };
        System.out.println(charArray); // works for char arrays

        // Strings

        String[] names1 = new String[1];
        names1[0] = "Doro";
        System.out.println("String element : " + names1[0]);

        String[] names2 = { "Nicusor" };
        System.out.println("String element : " + names2[0]);

        String[] strArray = { "Cheese", "Pepperoni", "Black Olives" };
        System.out.println("String element 1: " + Arrays.toString(strArray)); // print all elements of the array

        // Objects

        Practice01 arrObject = new Practice01(); // object
        final Object[] arr1 = { "efg", 23, 'F', "fdsd", 'h', arrObject };
        System.out.println("Index of Objects: " + Arrays.toString(arr1));

        // Multidimension arrays

        final String[][] names = new String[2][2];
        names[0][0] = "Doro";
        names[0][1] = "Nic";
        names[1][0] = "Doro";
        names[1][1] = "Stef";
        System.out.println("MultiDimension array [0][0]: " + names[0][0]);
        System.out.println("MultiDimension array [0][1]: " + names[0][1]);
        System.out.println("MultiDimension array [1][0]: " + names[1][0]);
        System.out.println("MultiDimension array [1][1]: " + names[1][1]);
        System.out.println("Whole multidimension array : " + Arrays.deepToString(names)); // print nested array

        for (var i = 0; i < names.length; i++) {
            for (var j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j]);
            }
        }

    }

    public static void methods() {
        char[] sourceArray = { 'd', 'e', 'c', 'a', 't', 'e', 'd', 'p' };
        Arrays.sort(sourceArray);
        System.out.println("Array to string: " + Arrays.toString(sourceArray));
        System.out.println("Array length: " + sourceArray.length);

        System.out.println("Arrays element search: " + Arrays.binarySearch(sourceArray, 'e'));

        List arrayAsList = Arrays.asList(sourceArray);
        System.out.println("Array transformed in list: " + (arrayAsList instanceof List));

        char[] targetArray1 = Arrays.copyOf(sourceArray, 6);
        System.out.println("Copied array: " + Arrays.toString(targetArray1));

        char[] targetArray2 = new char[20];
        targetArray2 = Arrays.copyOfRange(sourceArray, 2, 9);
        System.out.println("Copied array: " + Arrays.toString(targetArray2));

        char[] targetArray3 = new char[10];
        System.arraycopy(sourceArray, 3, targetArray3, 0, 4);
        System.out.println(targetArray3);

        char[] targetArray4 = { 'd', 'e', 'c', 'a', 't', 'e', 'd', 'p' };
        System.out.println("Equal arrays: " + Arrays.equals(sourceArray, targetArray4));

        char[] targetArray5 = new char[10];
        Arrays.fill(targetArray5, 'e');
        System.out.println("Fill: " + targetArray5[0]);

    }

}