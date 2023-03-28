import java.util.*;
import java.util.Scanner;

public class Practice02 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // reference();
        // findMin();
        // everyNthChar(2);
        // listAndAvg();
        // reverseArray();

        /////////////////////////////// Arrays sort alogorithms:
        // bubleSort();
        // selectionSortAsc();
        // selectionSortDesc();
        // insertSort();
        // insertSortRecursionCall;
        // shellSort();
        // mergeSortCall();
        // quickSortCall();
        // countingSortCall();
        // radixSortCall();
        // radixStringCall();

    }

    ////////////////////////////////////////////////////////////////////////////////////////////

    public static void reference() { // All object references in Java are passed by value

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        anotherArray[0] = 1;

        System.out.println("after change myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray= " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);

        System.out.println("after modify myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray= " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] arrayArgument) { // Java object variables are simply references that point to
        // real objects in the memory heap.
        arrayArgument[0] = 2;
        arrayArgument = new int[] { 1, 2, 3, 4, 5 };
    }

    /////////////////////////////// Fined Min

    public static void findMin() {

        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);

    }

    private static int[] readIntegers(int count) {

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    public static int findMinDif(int[] array) {

        int buffer = 0;
        boolean firstValue = true;

        for (int i = 0; i < array.length; i++) {
            if (firstValue) {
                buffer = array[i];
                firstValue = false;
            } else if (array[i] < buffer) {
                buffer = array[i];
            }

        }

        return buffer;
    }

    public static void minArry() {
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println(findMin(readIntegers(number)));

    }

    /////////////////////////////// create new array using every n char of another

    public static void everyNthChar(int n) {
        char[] sourceArray = new char[] { 'a', 'b', 'c', 'e', 'f', 'g', 'h', 'i' };

        if (sourceArray == null || sourceArray.length < n) {
            System.out.println(sourceArray);
        }

        char[] result = new char[sourceArray.length / n];

        for (int i = n - 1, index = 0; i < sourceArray.length; i += n) { // incepi de la n-1 pt ca primul index e 0
            result[index++] = sourceArray[i];
        }

        System.out.println(result);
    }

    //////////////////////////////// listAndAvg

    public static void listAndAvg() {

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.print("Element: " + i + ", typed value was: " + myIntegers[i] + "\n");
        }

        System.out.print("The avg of the array is: " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.print("Enter " + number + " integer values \n");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;

    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;

    }

    ////////////////////////////////
    // Reverse array (check the reference by type array)

    public static void reverseArray() {
        int[] array = { 2, 3, 6, 1, 7 };

        reverse(array);

        System.out.println(Arrays.toString(array));

    }

    public static void reverse(int[] array) { // reference type (modifies the actual array of reverseArray )

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) { // se fac in oglinda
            int buffer = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = buffer;
        }

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////// Arrays sort alogorithms:

    // A sorting algorithm is said to be stable if two objects with equal keys
    // appear in the same order in the sorted output as they appear in the unsorted
    // input.

    // Whereas a sorting algorithm is said to be unstable if there are two or more
    // objects with equal keys which don’t appear in same order before and after
    // sorting.

    // This is an example of stable sorting here 26 appears twice at position 6 and
    // 8 and their order is preserved in unsorted and sorted array i.e, element 26
    // (blue - b) at position 6 appears first in unsorted and sorted array (before
    // and after sorting).

    // 35 33 42 10 14 19 26(b) 44 26(r) 31
    // 10 14 19 26(b) 26(r) 31 33 35 42 44

    // In the case of an unstable sort, this order of appearance before and after
    // sorting is not necessarily preserved.

    // Some sorting algorithms such as Insertion sort, Merge Sort, Bubble Sort, etc.
    // are stable by nature, and other sorting algorithms like Heap Sort, Quick
    // Sort, etc. are not stable by nature.

    public static void bubleSort() { // stable algorithm (most ineficient algorithm)!

        // Why bubble sort is called “bubble” sort?
        // The “bubble” sort is called so because the list elements with greater value
        // than their surrounding elements “bubble” towards the end of the list. For
        // example, after first pass, the largest element is bubbled towards the right
        // most position. After second pass, the second largest element is bubbled
        // towards the second last position in the list and so on.

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        // 1
        for (int i = intArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArray[j] > intArray[j + 1]) { // bubles to the right
                    swap(intArray, j, j + 1);
                }
            }
        }

        // 2

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 1; j < (intArray.length - i); j++) { // bubles to the right
                if (intArray[j - 1] > intArray[j]) {
                    swap(intArray, j - 1, j);
                }
            }
        }

        // sau
        // not sure if its buble sort due to IF condition (compared elements are not
        // adiacent?)

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) { // boubles to the left
                    swap(intArray, i, j);

                }
            }
        }

        // 3
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                    // flag = true;
                }
            }
        }

        System.out.println(Arrays.toString(intArray));
    }

    public static void swap(int[] array, int i, int j) { // modifies same array

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    /////////////////////////////////////////////////

    public static void selectionSortAsc() { // unstable algorithm
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int i = intArray.length - 1; i > 0; i--) { // i is used as array index (starts with the max)

            int index = 0;
            for (int j = 1; j <= i; j++) {
                if (intArray[j] > intArray[index]) {
                    index = j;
                }
            }

            int temp = intArray[index];
            intArray[index] = intArray[i];
            intArray[i] = temp;

        }

        System.out.println(Arrays.toString(intArray));
    }

    public static void selectionSortDesc() {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int i = 0; i < intArray.length - 1; i++) {

            int index = intArray.length - 1;
            for (int j = i; j < intArray.length; j++) {
                if (intArray[j] > intArray[index]) {
                    index = j;
                }
            }

            int temp = intArray[i];
            intArray[i] = intArray[index];
            intArray[index] = temp;

        }

        System.out.println(Arrays.toString(intArray));
    }

    /////////////////////////////////////////////////

    public static void insertSort() { // stable alorithm (**** de retinut!!!)

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int i = 1; i < intArray.length; i++) {
            int buffer = intArray[i];

            int j;

            for (j = i; j > 0 && intArray[j - 1] > buffer; j--) { // desc: intArray[j - 1] < newElement
                intArray[j] = intArray[j - 1];
            }

            intArray[j] = buffer;

        }
        System.out.println(Arrays.toString(intArray));

    }

    // Same algorithm but implemented recursively

    public static void insertSortRecursionCall(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        insertRecursionSort(intArray, 1); // array is ordered in the method

        System.out.println(Arrays.toString(intArray));

    }

    public static void insertRecursionSort(int[] intArray, int i) {

        if (i >= intArray.length) { // if (numItems < 2)
            return;
        }

        // insertionRecursionSort(intArray, numItems - 1);
        int newElement = intArray[i]; // int newElement = intArray[numItems - 1];
        int j;
        for (j = i; j > 0 && intArray[j - 1] > newElement; j--) {
            intArray[j] = intArray[j - 1];

        }

        intArray[j] = newElement;
        insertRecursionSort(intArray, i + 1);

    }

    /////////////////////////////////////////////////

    // Similar with insertSort above, using the "gap" a preorder of some of the
    // elements is done

    public static void shellSort() { // unstable algorithm

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];

                int j;

                for (j = i; j >= gap && intArray[j - gap] > newElement; j -= gap) {
                    intArray[j] = intArray[j - gap];
                }

                intArray[j] = newElement;

            }
        }

        System.out.println(Arrays.toString(intArray));
    }

    ///////////////////////////////////////////////// Recursive algorithms:

    public static void mergeSortCall() { // stable alorithm (to remember)
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2; // m=3; m=1; m=2
        mergeSort(input, start, mid);

        mergeSort(input, mid, end);

        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] >= input[mid]) { // use <= order asc; condition stops useless work
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start]; // 7, 55, -22, 1 -22,1
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++]; // use <= for asc
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);

    }

    /////////////////////////////////////////////////

    public static void quickSortCall() { // unstable algorithm
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        quickSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        // Dont forget about recursion!
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end - 1;

        while (i < j) {
            while (i < j && input[j] >= pivot) {
                --j;
            }
            ;

            if (i < j) {
                input[i] = input[j];
            }

            while (i < j && input[i] <= pivot) {
                ++i;
            }
            ;

            if (i < j) {
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return j;

    }

    /////////////////////////////////////////////////

    public static void countingSortCall() { // stable algorithm (**** de retinut!!!)
        int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3, 6, 78 };

        countingSort(intArray, 1, 78);

        System.out.println(Arrays.toString(intArray));

    }

    public static void countingSort(int[] input, int min, int max) {

        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++; // i[8]=0 => i[8]=1
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }

    /////////////////////////////////////////////////

    public static void radixSortCall() { // radix sort depends on a sorting subroutine that must be stable

        int[] radixArray = { 4725, 4586, 1330, 8792, 1594, 5729 };

        radixSort(radixArray, 10, 4);

        System.out.println(Arrays.toString(radixArray));
    }

    public static void radixSort(int[] input, int radix, int width) {

        for (int i = 0; i < width; i++) { // i<4
            radixSingleSort(input, i, radix); // i=0 radix=10
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix) {

        // 4725, 4586, 1330, 8792, 1594, 5729 | radixSingleSort(radixArray,0,10)

        int numItems = input.length; // 6
        int[] countArray = new int[radix];

        for (int value : input) {
            countArray[getDigit(position, value, radix)]++; // countArray[5]=countArray[5]+1
        }

        // Adjust the count array (calculates where values should be written back in the
        // original array; we want to calculate how many values are equal or less). For
        // example you want to store a value at index 3 because 3 values are equal or
        // less than it). We can calculate each adjusted count by adding up the counts
        // up and including x value.

        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        // Writting the values into the array in backwards order ensures stability:

        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex]; // temp[5]=input[5]
            // temp[countArray[getDigit(position, input[tempIndex], radix)]] - 1]
            // -- decrements the value and immediately returns it.
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) { // temp sorted array
            input[tempIndex] = temp[tempIndex];
        }

    }

    public static int getDigit(int position, int value, int radix) { // getDigit(0,4586,10)
        int x = value / (int) Math.pow(radix, position) % radix; // % follows /
        return x;
    }

    //

    public static void radixStringCall() {
        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb" };

        radixSortString(stringsArray, 26, 5);

        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
    }

    public static void radixSortString(String[] input, int radix, int width) {

        for (int i = 0; i < width; i++) {
            radixSingleSortString(input, i, radix);
        }
    }

    public static void radixSingleSortString(String[] input, int position, int radix) {

        int numItems = input.length;
        int[] countArray = new int[radix];

        for (String value : input) {
            countArray[getDigitString(position, value, radix)]++;
        }

        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigitString(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }

    }

    public static int getDigitString(int position, String value, int radix) { //
        Character[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        int posrev = value.length() - 1 - position;
        char ch1 = value.charAt(posrev);
        int pos = Arrays.asList(alphabet).indexOf(ch1);
        return pos;

        // return value.charAt(position) / (int) Math.pow(radix, position) % radix;
    }
}
