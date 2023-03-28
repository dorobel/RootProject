import java.util.*;

public class Practice02 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) {

        ////////////////////
        // Exercises ArrayList & LinkedList:
        // sumArrayList();
        // zipArryList();
        // sortArrayList();
        // reverseStringIntoArrayList();
        // reverseArrayList();
        // tripleArrayList();
        // capitalArrayList();
        // treiArrayList();
        // noDuplicateArrayList();
        // luckyArrayList(13, 13, 3);
        // sixtyArrayList();
        // bondArrayList();
        // targetArrayList(5);
        // game();

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////// Exercises ArrayList & Linked List

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // Sum arrays

    public static void sumArrayList() {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(3);
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += lst.get(i); // the Integer will be unboxed to int (integer array list)
        }
        System.out.println(sum);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // Zip arrays

    public static void zipArryList() {

        ArrayList<ArrayList<Integer>> zip = new ArrayList<>();

        ArrayList<Integer> lsta = new ArrayList<>();
        ArrayList<Integer> lstb = new ArrayList<>();

        lsta.add(1);
        lsta.add(3);

        lstb.add(2);
        lstb.add(4);

        boolean bol = true;

        while (bol) {
            int i = 0;
            zip.add(new ArrayList<>());
            for (int j = 0; j < lsta.size(); j++) {
                zip.get(i).add(lsta.get(j));
            }
            zip.add(new ArrayList<>());
            for (int j = 0; j < lstb.size(); j++) {
                zip.get(i + 1).add(lstb.get(j));
            }
            i++;
            bol = false;

        }
        System.out.println(zip);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // Sort arrays

    public static void sortArrayList() {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(33);
        lst.add(1);
        lst.add(9);
        lst.add(3);
        lst.add(99);

        for (int i = 0; i < lst.size(); i++) {
            for (int j = i + 1; j < lst.size(); j++) {
                if (lst.get(j - 1) > lst.get(j)) {
                    int val = lst.get(j);
                    lst.set(j, lst.get(j - 1));
                    lst.set(j - 1, val);
                    System.out.println(lst);
                }
            }
        }

        System.out.println(lst);

    }

    public static void sortArrayListNew() {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(33);
        lst.add(1);
        lst.add(9);
        lst.add(3);
        lst.add(99);

        for (int i = 1; i < lst.size(); i++) {

            int buffer = lst.get(i);
            int j;

            for (j = i; j > 0 && lst.get(j - 1) > buffer; j--) {

                lst.set(j, lst.get(j - 1));
            }

            lst.set(j, buffer);
        }

        System.out.println(lst);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // Reverse string

    public static void reverseStringIntoArrayList() {
        String reversed = "pula";

        ArrayList<Character> lst = new ArrayList<>();

        for (int i = reversed.length() - 1; i >= 0; i--) {
            lst.add(reversed.charAt(i));
        }

        System.out.println(lst);

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // Reverse arrays

    public static void reverseArrayList() {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(3);
        lst.add(9);
        lst.add(33);
        lst.add(99);
        System.out.println(lst);

        int maxIndex = lst.size() - 1;
        int halfLength = lst.size() / 2;

        for (int i = 0; i < halfLength; i++) { // se fac in oglinda
            int buffer = lst.get(i);
            lst.set(i, lst.get(maxIndex - i));
            lst.set(maxIndex - i, buffer);
        }

        System.out.println(lst);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // Return an array where for every char in the original you get x items

    public static void tripleArrayList() {

        ArrayList<Character> triple = new ArrayList<>();
        String tripleString = "Lumea";

        for (int i = 0; i < tripleString.length(); i++) {
            for (int j = 0; j < 3; j++) {
                triple.add(tripleString.charAt(i));
            }

        }

        System.out.println(triple);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // Write a method that capitalizes the first and fourth letters of a name

    public static void capitalArrayList() {
        ArrayList<Character> capital = new ArrayList<>();
        String capitalString = "alexandru";

        for (int i = 0; i < capitalString.length(); i++) {
            if (i == 0 || i == 4) {
                char chup = Character.toUpperCase(capitalString.charAt(i));
                capital.add(chup);
            } else {
                capital.add(capitalString.charAt(i));
            }

        }

        System.out.println(capital);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // Check if one list appears at the very end of the other list?

    public static void treiArrayList() {
        ArrayList<Character> treiUnu = new ArrayList<>();
        treiUnu.add('c');
        treiUnu.add('d');
        treiUnu.add('e');
        ArrayList<Character> treiDoi = new ArrayList<>();
        treiDoi.add('a');
        treiDoi.add('b');
        treiDoi.add('c');
        treiDoi.add('d');
        treiDoi.add('e');

        for (int i = 0; i < treiUnu.size(); i++) {
            if (treiUnu.get(i) == treiDoi.get(treiDoi.size() - 3 + i)) {
                System.out.println("Contine");
            } else {
                break;
            }

        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // Eliminate duplicates from a list

    public static void noDuplicateArrayList() {
        ArrayList<Character> noDuplicate = new ArrayList<>();
        noDuplicate.add('a');
        noDuplicate.add('b');
        noDuplicate.add('e');
        noDuplicate.add('d');
        noDuplicate.add('e');
        noDuplicate.add('a');

        for (int i = 0; i < noDuplicate.size(); i++) {
            for (int j = i + 1; j < noDuplicate.size(); j++) {
                if (noDuplicate.get(i) == noDuplicate.get(j)) {
                    noDuplicate.remove(j);
                }
            }
        }

        System.out.println(noDuplicate);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // Given 3 numerical values, a b c, return their sum. However, if one of the
    // values is 13 then it does not count towards the sum and values to its right
    // do not count. So for example, if b is 13, then both b and c do not count.
    //
    // luckySum(1, 2, 3) → 6
    // luckySum(1, 2, 13) → 3
    // luckySum(1, 13, 3) → 1

    public static void luckyArrayList(int a, int b, int c) {

        ArrayList<Integer> lucky = new ArrayList<>();
        lucky.add(a);
        lucky.add(b);
        lucky.add(c);
        int sum = 0;

        for (int i = 0; i < lucky.size(); i++) {
            if (lucky.get(i) == 13) {
                lucky.subList(i, lucky.size()).clear(); // sau break;
            } else {
                sum += lucky.get(i);
            }
        }
        System.out.println(sum);

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // SUMMER OF '69: Return the sum of the numbers in the array,
    // except ignore sections of numbers starting with a 6 and extending
    // to the next 9 (every 6 will be followed by at least one 9).

    public static void sixtyArrayList() {
        ArrayList<Integer> sixty = new ArrayList<>();
        sixty.add(2);
        sixty.add(1);
        sixty.add(6);
        sixty.add(2);
        sixty.add(9);
        sixty.add(10);
        int sum = 0;

        for (int i = 0; i < sixty.size(); i++) {
            if (sixty.get(i) == 6) {
                i = sixty.indexOf(9);
            } else {
                sum += sixty.get(i);
            }

        }
        System.out.println(sum);
    }

    // or

    public static void sixtyArrayListDiff() {
        ArrayList<Integer> sixty = new ArrayList<>();
        sixty.add(2);
        sixty.add(1);
        sixty.add(6);
        sixty.add(2);
        sixty.add(9);
        sixty.add(10);
        int sum = 0;

        for (int i = 0; i < sixty.size(); i++) {
            if (sixty.get(i) == 6) {
                sixty.subList(i, sixty.indexOf(9)).clear();
            } else {
                sum += sixty.get(i);
            }

        }

        System.out.println(sum);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // Write a function that takes in a list of integers and
    // prints True if it contains 007 in order

    public static void bondArrayList() {
        ArrayList<Integer> bond = new ArrayList<>();
        bond.add(2);
        bond.add(0);
        bond.add(7);
        bond.add(0);
        bond.add(6);
        bond.add(0);
        bond.add(9);
        bond.add(7);

        ArrayList<Integer> catchBond = new ArrayList<>();
        catchBond.add(0);
        catchBond.add(0);
        catchBond.add(7);

        int count = 2;

        for (int i = 0; i < bond.size(); i++) {
            if (bond.get(i) == 0 && count > 0) {
                catchBond.remove(0);
                count -= 1;
            }

            else if (bond.get(i) == 7 && count == 0) {
                catchBond.remove(0);
            }
        }

        if (catchBond.size() == 0) {
            System.out.println("Found it!");
        } else {
            System.out.println("Not here!");
        }
        System.out.println(catchBond);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // Write a method that finds two different numbers in the array that when
    // added together, give the target number. For example: ([1,2,3], 4)
    // should return [1,3]

    private static void targetArrayList(int result) {
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(2);
        elements.add(2);
        elements.add(3);
        elements.add(3);
        boolean sumsup = false;

        for (int i = 0; i < elements.size(); i++) {
            if (sumsup == true) {
                break;
            }
            for (int j = 1; j < elements.size(); j++) {
                if (elements.get(i) + elements.get(j) == result) {
                    System.out.println("Sums up!");
                    sumsup = true;
                    break;
                }
            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // Number guess game

    // 1. The computer will think of 3 digit number that has no repeating digits.
    // 2. You will then guess a 3 digit number
    // 3. The computer will then give back clues, the possible clues are:
    // Close: You've guessed a correct number but in the wrong position
    // Match: You've guessed a correct number in the correct position
    // Nope: You haven't guess any of the numbers correctly
    // 4. Based on these clues you will guess again until you break the code with a
    // perfect match, the game will report "CODE CRACKED"!

    public static ArrayList getRandom() {
        int min = 100;
        int max = 999;
        int x = (int) (Math.random() * ((max - min) + 1)) + min;

        ArrayList value = new ArrayList<>();

        while (x > 0) {
            value.add(x % 10);
            x /= 10;
        }
        return value;
    }

    public static ArrayList guess() {
        System.out.print("Guess number \n");
        Integer x = scanner.nextInt();
        x = reverse(x);

        ArrayList value = new ArrayList<>();
        while (x > 0) {
            value.add(x % 10);
            x /= 10;
        }
        return value;

    }

    public static int reverse(int number) {

        int reverse = 0;
        while (number != 0) {
            int lastdigit = number % 10;
            reverse *= 10;
            reverse += lastdigit;
            number /= 10;
        }
        return reverse;
    }

    public static boolean equalBol(ArrayList x, ArrayList y) {
        boolean isEqual = x.equals(y);
        return isEqual;
    }

    public static String hints(ArrayList x, ArrayList y) {
        if (equalBol(x, y)) {
            return "Well done";
        }

        for (int i = 0; i < x.size(); i++) {
            for (int j = 0; j < y.size(); j++) {
                if (x.get(i) == y.get(i)) {
                    return "Match";
                } else if (x.get(i) == y.get(j)) {
                    return "Close";
                }
            }

        }

        return "Nothing";

    }

    public final static void game() {

        String report = "";
        ArrayList ranList = getRandom();
        System.out.println(ranList);

        while (report != "Well done") {
            ArrayList guessList = guess();
            System.out.println(guessList);
            report = hints(ranList, guessList);
            System.out.println(report);
        }
    }

}
