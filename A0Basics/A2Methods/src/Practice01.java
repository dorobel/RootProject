public class Practice01 {
    public static void main(String[] args) {
         //isCatPlaying(true,36);
         calculateScoreCall();
        // printConversion(25.42);
        // printMegaBytesAndKiloBytes(2500);
        // System.out.println(isLeapYear(1800));
        // System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.1757));

        // calcFeetAndInchesToCentimeters(6, 0);
        // calcFeetAndInchesToCentimeters(157);
        // System.out.println(getDurationString(65, 45));
        // System.out.println(getDurationString(3945L));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        return (summer) ? temperature >= 25 && temperature <= 45 : temperature >= 25 && temperature <= 35;
        // if cond ? return 1 : return2
    }

    /////
    public static void calculateScoreCall() {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        ///

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(
                playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4; // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }

    /////
    public static void printConversion(double kilometersPerHour) {
        if (toMilesPerHour(kilometersPerHour) >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            return Math.round(kilometersPerHour / 1.609);
        }

        return -1;
    }

    /////
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int modK = kiloBytes % 1024;
        if (kiloBytes > 0) {
            System.out.println(kiloBytes + " KB = " + Math.round(kiloBytes / 1024) + " MB and " + modK + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }

    /////
    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        }

        if (year % 4 != 0) {
            return false;
        }

        else if ((year % 100 == 0) && (year % 400 != 0)) {
            return false;
        }

        else {
            return true;
        }

    }

    /////
    public static boolean areEqualByThreeDecimalPlaces(double no1, double no2) {
        int n1 = (int) (no1 * 1000);
        int n2 = (int) (no2 * 1000);

        if (n1 != n2) {
            return false;
        }

        return true;

    }

    /////
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    /////
    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

}
