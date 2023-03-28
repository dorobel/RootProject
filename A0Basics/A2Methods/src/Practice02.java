import java.util.*;

public class Practice02 {

    //////////////////////////////////////////////
    // Other practice exercises with methods:

    public static void main(String[] args) {

        // Odd numbers:
        System.out.println("Sum odd: " + sumOdd(1, 11));

        // Sum digits:
        System.out.println("Sum digits: " + sumDigits(135));

        // Is number a palindrome:
        System.out.println("Is palindrome: " + isPalindrome(131));

        // Sum first and last digits:
        System.out.println("Sum first and last digits: " + sumFirstAndLastDigit(56));

        // Even digit sum:
        System.out.println("Even digit sum: " + getEvenDigitSum(568));

        // Numbers have shared digit:
        System.out.println("Numbers have shared digit: " + hasSharedDigit(76, 68));

        // Greatest divisor:
        System.out.println("Greatest divisor: " + getGreatestCommonDivisor(25, 15));

        // Can pack:

        // For primes range:
        ForPrimes(50);

        // While primes range:
        WhilePrimes(50);

        // Larget prime:
        System.out.println("Largest prime: " + getLargestPrimeFor(21));
        System.out.println("Largest prime: " + getLargestPrimeWhile(45));

        // Number to words:
        numberToWords(100);

        // Factorial:
        System.out.println("Factorial: " + iterativeFactorial(3));
        System.out.println("Factorial: " + recursiveFactorial(3));

        // Leap years & days in month:
        System.out.println("Days in Month: " + getDaysInMonth(1, 2004));

        // Sum digits from keyboard
        SumDigitsKey();

        // Boolean min max
        minMax();
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////
    // Sum range Odd numbers ( suma numerelor impare intr-un range )

    public static boolean isOdd(final int number) {
        return (number % 2 == 0 || number < 1) ? false : true;

    }

    public static int sumOdd(int start, final int end) {

        if ((start > end) || (start < 0) || (end < 0)) {
            return -1;
        }

        int sum = 0;
        for (start = start; start <= end; start++) {
            if (isOdd(start)) {
                sum += start;
            }
        }
        return sum;

    }

    //////////////////////////////////////////////
    // Sum digits (suma cifrelor unui numar)

    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {

            int digit = number % 10;
            sum += digit;
            number /= 10; // drop the last digit (number will round to an int value, ex: 12/10=1,2)
        }
        return sum;
    }

    //////////////////////////////////////////////
    // Is Palindrome ( ac cifra citita invers )

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        final int compno = number; // stochezi valoarea parametrului

        while (number > 0) {

            final int lastdigit = number % 10;
            reverse = reverse * 10 + lastdigit;
            number /= 10;

        }

        return (compno == reverse);
    }

    //////////////////////////////////////////////
    // Sum first and last digits

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = number % 10;

        while (number > 0) {
            if (number < 10) {
                sum += number; // break coud be added right after
            }
            number /= 10;

        }

        return sum;

    }

    // public class FirstLastDigitSum {
    // public static int sumFirstAndLastDigit(int number){
    // if (number < 0) {
    // return -1;
    // }
    // int lastDigit= number % 10;
    // while (number > 9){
    // number/=10;
    // }
    // return number+=lastDigit;
    // }
    // }

    //////////////////////////////////////////////
    // Even digit sum ( suma cifrelor pare dintr-un numar )

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            int notOdd = digit % 2 == 0 ? digit : 0;
            sum += notOdd;
            number /= 10;
        }
        return sum;
    }

    //////////////////////////////////////////////
    // Numbers have shared digit

    public static boolean hasSharedDigit(int firstNum, final int secondNum) {

        if ((firstNum < 10) || (firstNum > 99)) {
            return false;
        } else if ((secondNum < 10) || (secondNum > 99)) {
            return false;
        }

        while (firstNum > 0) {

            int tempNum = secondNum;

            while (tempNum > 0) {
                if ((firstNum % 10) == (tempNum % 10)) { // firstNum its the same at each inner loop
                    return true;
                }
                tempNum /= 10; // next digit of tempNum - inner loop
            }

            firstNum /= 10; // next digit - outer loop
        }

        return false;
    }

    // better method:

    public static boolean hasSharedDigitDifferentMethod(int firstNum, final int secondNum) {

        while (firstNum > 0) {
            int comp = firstNum % 10;
            int secNO = secondNum;
            while (secNO > 0) { // without this secondNum would get to 0 after first iteration
                int sec = secNO % 10;
                if (comp == sec)
                    return true;

                secNO /= 10;
            }

            firstNum /= 10;
        }

        return false;

    }

    //////////////////////////////////////////////
    // Greatest divisor

    public static int getGreatestCommonDivisor(final int first, final int second) {

        if ((first < 10) || (second < 10)) {
            return -1;
        }

        int divisor = 0;
        int i = 1;
        while (i < Math.max(first, second)) {
            if (first % i == 0 && second % i == 0) {
                divisor = i;
            }
            i++;
        }

        return divisor;

        // for(int i=1;i<Math.max(first, second);i++){
        // if(first%i==0){
        // if(second%i==0)
        // temp=i;
        // }
        // }

    }

    //////////////////////////////////////////////
    // Can pack ( canPack(2, 5,4, 14) -> 2*5+4=14)

    public static boolean canPack(final int bigCount, final int smallCount, final int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        for (int i = 0; i <= bigCount; i++) {
            for (int j = 0; j <= smallCount; j++) {
                if (i * 5 + j == goal) {
                    return true;
                }
            }

        }

        return false;
    }

    //////////////////////////////////////////////
    // Primes

    public static boolean PRIMES(final int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static void ForPrimes(int number) {

        for (int i = 5; i < number; i++) {
            if (PRIMES(i)) {
                System.out.println("Foor loop prime: " + i);
            }
        }
    }

    public static void WhilePrimes(int finishno) {
        int number = 5;

        while (number <= finishno) {
            if (PRIMES(number)) {
                System.out.println("While Loop prime " + number);
            }
            number++;
        }
    }

    //////////////////////////////////////////////
    // Largest prime (45: 3*3*5 <--5 is the largest)

    public static int getLargestPrimeFor(final int number) {
        int factor = number; // case the number itself is a prime

        for (int i = 2; i <= number; i++) {

            if (number % i == 0) { // if the number is not a prime:

                boolean isPrime = true; // variable used by next block
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    factor = i;
                }
            }
        }

        return factor;
    }

    public static int getLargestPrimeWhile(int number) {
        int i = 2;

        if (number < 2) {
            return -1;
        } else {
            i = 2;
        }

        while (i < number) {
            if (number % i != 0) {
                i++; // i will increase up to number value case its a prime
            } else {
                number = number / i;
                i = 2;
            }
            continue;
        }
        return i;
    }

    //////////////////////////////////////////////
    // Number to words

    public static int getDigitCount(final int number) {

        int count = 0;
        int num = number;

        while (num > 0) {
            count += 1;
            num /= 10;
        }

        if (number == 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return count;
        }
    }

    public static int reverse(int number) {

        int reverse = 0;
        while (number > 0) {
            final int lastdigit = number % 10;
            reverse *= 10;
            reverse += lastdigit;
            number /= 10;
        }
        return reverse;
    }

    public static void numberToWords(final int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
        }

        final int numberDigitCount = getDigitCount(number);
        int newNumber = reverse(number);
        final int reverseDigitCount = getDigitCount(newNumber);

        while (newNumber > 0) {
            final int word = newNumber % 10;
            switch (word) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            newNumber /= 10;
        }
        final int missingZeros = numberDigitCount - reverseDigitCount;
        for (int i = 0; i < missingZeros; i++) {
            System.out.println("Zero");
        }
    }

    //////////////////////////////////////////////
    // Factorial

    public static int iterativeFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;

    }

    public static int recursiveFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);

    }

    //////////////////////////////////////////////
    // Leap years ( ani bisecti si nr de zile ale lunii)

    public static boolean isLeapYear(final int year) {
        if ((year > 9999) || (year < 1)) {
            return false;
        }

        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)); // returns true
    }

    public static int getDaysInMonth(final int month, final int year) {
        if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
            return -1;
        } else if ((isLeapYear(year)) && (month == 2)) {
            return 29;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 2:
                return 28;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

        }
        return month;
    }

    //////////////////////////////////////////////
    // Sum 10 numbers entered a keyborad

    public static void SumDigitsKey() {

        final Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (counter < 10) {
            final int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            final boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                final int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println("sum = " + sum);

    }

    //////////////////////////////////////////////
    // Boolean min max ( min max of entered numbers)

    public static void minMax() {

        final Scanner scanner = new Scanner(System.in); // user inserted data

        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number: ");

            final boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                final int number = scanner.nextInt();

                if (first) {
                    max = number;
                    min = number;
                    first = false;
                }

                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                }

            } else {
                System.out.println("Max number: " + max);
                System.out.println("Min number: " + min);
                break;
            }

            scanner.nextLine(); // handle end of line (enter key)
        }

    }
}
