public class Practice {

    public static void main(final String[] args) {

         IFTHENELSE();
        // SWITCH();
        // FOR();
        // WHILE();
        //BREAKANDCONTINUE(); // check for 4&5 inside
    }

    //////////////////////////////////////////////
    // IF THEN ELSE

    public static void IFTHENELSE() {
        final int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("If Then Else = " + grade);
    }

    //////////////////////////////////////////////
    // SWITCH (testing multiple values of same variable (primitive type)!)

    public static void SWITCH() {

        final int month = 8;
        final int year = 2000;
        int numDays = 0;
        String monthString;

        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }

        System.out.println("Switch example:" + monthString);
    }

    //////////////////////////////////////////////
    // FOR

    public static void FOR() {

        // 1
        final String nameFor = "Nicusor";
        for (int i = 0; i < nameFor.length(); i++) {
            System.out.println("For loop => characters for nameFor1: " + nameFor.charAt(i));
        }

        // 2
        final String nameForDouble = "Nicusor";
        for (int i = 0; i < nameForDouble.length(); i += 2) {
            System.out.println("For loop => characters for nameFor2: " + nameForDouble.charAt(i));
        }

        // 3
        int j; // declared outside FOR loop, it can be used afterwords outside the loop
        for (j = 1; j < 4; j++) {
            System.out.println("For loop inside value is: " + j);
        }

        System.out.println("Outside value of j is: " + j); // 4

        // 4
        for (int x = 1; x < 15; x++) {
            if (x % 2 != 0) {
                System.out.println("For loop odd numbers: " + x);
            }
        }

    }

    //////////////////////////////////////////////
    // WHILE & DO WHILE (executes at least once)

    public static void WHILE() {

        // 1
        int count = 1;
        while (count < 4) {
            System.out.println("WHILE DO count inside loop before increment: " + count);
            count++;
            System.out.println("WHILE DO count inside loop after increment: " + count);
        }
        System.out.println("WHILE DO count outside loop: " + count); // 4

        count = 1;
        while (true) { // infinite loop
            if (count == 4) {
                break;
            }
            System.out.println("different WHILE DO count inside loop before increment: " + count);
            count++;
            System.out.println("different WHILE DO count inside loop after increment: " + count);
        }
        System.out.println("different WHILE DO count outside loop: " + count); // 4

        // 2
        count = 1;
        do {
            System.out.println("DO WHILE count is: " + count);
            count++;
        } while (count < 4);
        System.out.println("DO WHILE count outside loop: " + count); // 4

        int counter = 4;
        do {
            System.out.println("DO WHILE count reverse is: " + counter);
            counter--;
        } while (counter > 0);
        System.out.println("another DO WHILE count outside loop: " + counter);

    }

    //////////////////////////////////////////////
    // BREAK & CONTINUE

    public static void BREAKANDCONTINUE() {
        // 1
        int num = 0;
        while (num <= 15) {
            num++;

            if (num < 5) {
                System.out.println("Continue will get back to start: " + num);
                continue;
            }

            System.out.println("Number value: " + num);

            if (num >= 10) {
                System.out.println("Breaking at : " + num);
                break;
            }
        }

        // 2
        final String breakTest = "Testdefrana";
        final char searchfor = 'f';
        boolean foundIt = false;

        for (int i = 0; i < breakTest.length(); i++) {
            if (breakTest.charAt(i) == searchfor) { // compres two primitive data types
                foundIt = true;
            } else {
                foundIt = false;
            }

            if (!foundIt) {
                System.out.println("Character not found!");
                continue; // goes back to the beggining of for loop
            } else {
                System.out.println("Found character at position: " + i);
                break;
            }
        }

        // 3
        final String searchMe = "peter piper picked a " + "peck of pickled peppers";
        final int max = searchMe.length();
        int numPs = 0;

        for (int k = 0; k < max; k++) {
            // interested only in p's
            if (searchMe.charAt(k) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");

        // 4
        final String searchMeStrg = "Look for a substring in me";
        final String substring = "sub";
        boolean foundItStr = false;

        final int maxStr = searchMeStrg.length() - substring.length();
        test: for (int i = 0; i <= maxStr; i++) { // labeled for
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) { // sau (k < n)
                if (searchMeStrg.charAt(j++) != substring.charAt(k++)) {
                    continue test; // labeled continue => goes to the beggining of for lopp
                }
            }
            foundItStr = true; // if it passed the while sustring is found
            break test; // labeled break
        }
        System.out.println(foundItStr ? "Found it" : "Didn't find it");

        // 5 same as 4

        test: for (int i = 0; i < maxStr; i++) {
            for (int j = 0, k = i; j < substring.length(); j++, k++) {
                if (searchMeStrg.charAt(k) != substring.charAt(j)) {
                    continue test;
                }
            }
            foundItStr = true;
        }

        System.out.println(foundItStr);
    }

}
