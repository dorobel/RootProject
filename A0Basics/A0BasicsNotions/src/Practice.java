import java.util.*;

public class Practice {
    public static void main(String[] args) { // arguments of type string

        basics();

    }

    public static void basics() {
        // numbers:

        long a = 5L;
        int b; // declare
        b = 6; // assign value
        final double c = 15D; // c = 20; will generate an error: cannot assign a value to a final variable
        System.out.println("Sum: " + (a + b + c)); // you could use String.valueOf(a + b + c)
        System.out.println("Weird numbers: " + String.format("%.2f", (((a + b) * 2679) / 67.345)));

        // strings:

        String name1 = "Nicusor";
        name1 = "Niculae"; // creates new string with the new values ( strings are immutable )
        String name2 = "Dorobantu";
        System.out.println("String concat : " + name1 + " " + name2);
        System.out.println("String length : " + name1.length());
        System.out.println("String character at : " + name1.charAt(0));
        System.out.println("Substing : " + name1.substring(2, 3));
        System.out.println("Split : " + name1.split("c")[1]); // split intoarce un array String[] -- vezi mai jos
        System.out.println("Repeat : " + name2.repeat(3));
        System.out.println("Replace : " + name2.replace("b", "l")); // creates new string with the new values
        System.out.println("Escape \" \" characters");
        System.out.println("End with same characters, returns boolean: " + name1.endsWith("or"));
        System.out.println("Start with same characters, returns boolean: " + name1.startsWith("Ni"));
        System.out.println("Compare characters, returns <0 , =0, >0: " + name1.compareTo("Niculae"));
        System.out.println("Compares two strings lexicographically, returns boolean: " + name1.equals("Niculae"));

        String number = "2018";
        System.out.println("String to number: " + Integer.parseInt(number));
        System.out.println("String to number: " + Double.parseDouble(number));

        // ternary:

        boolean x = true;
        int y = (x == true) ? 4 : 5; // if x==true return 4 else 5
        System.out.println("Ternary: " + y);

        int z = !x ? 4 : 5;
        System.out.println("Ternary: " + z);

        // user input

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year of birth: ");
        // boolean hasNextInt = scanner.hasNextInt();
        // System.out.println(hasNextInt); // works before and after
        int yearOfBirth = scanner.nextInt();
        // System.out.println(hasNextInt); // works before and after
        // scanner.nextLine(); // handles next line character enter key

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Your name is : " + name + " and you are born in  " + yearOfBirth);
    }

}
