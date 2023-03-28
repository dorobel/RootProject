
import java.util.*;

public class Practice02 {

    public static void main(final String[] args) {

         checkAmz("cars");
        // signIn("Andrei", "secret");

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////

    public static HashMap amazon() {

        HashMap<String, Integer> amz = new HashMap<>();

        amz.put("books", 2);
        amz.put("cars", 3);

        return amz;

    }

    public static void checkAmz(String product) {
        HashMap<String, Integer> amz = amazon();

        for (String i : amz.keySet()) {
            if (i == product) {
                String[] s = i.split("r");
                System.out.println("Product exists " + s[0]);
                break;
            }
        }

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // Facebook app

    public static ArrayList database() {

        HashMap<String, String> pers1 = new HashMap<>();
        pers1.put("username", "Andrei");
        pers1.put("password", "secret");

        HashMap<String, String> pers2 = new HashMap<>();
        pers2.put("username", "Doro");
        pers2.put("password", "telefon");

        HashMap<String, String> pers3 = new HashMap<>();
        pers3.put("username", "Iulia");
        pers3.put("password", "telefon");

        ArrayList<HashMap> database = new ArrayList<>();
        database.add(pers1);
        database.add(pers2);
        database.add(pers3);

        return database;

    }

    public static ArrayList newsfeed() {

        HashMap<String, String> feed1 = new HashMap<>();
        feed1.put("username", "Sally");
        feed1.put("timeline", "So tired from all that learning!");

        HashMap<String, String> feed2 = new HashMap<>();
        feed2.put("username", "Bobby");
        feed2.put("timeline", "Javascript is sooooo cool!");

        HashMap<String, String> feed3 = new HashMap<>();
        feed3.put("username", "Mitch");
        feed3.put("timeline", "Java is preeetyy cool!");

        ArrayList<HashMap> feed = new ArrayList<>();
        feed.add(feed1);
        feed.add(feed2);
        feed.add(feed3);

        return feed;

    }

    public static boolean isUserValid(String username, String password) {

        ArrayList database = database();
        // System.out.println(database);
        for (var i = 0; i < database.size(); i++) {
            HashMap dict = (HashMap<String, String>) database.get(i);
            if (dict.get("username") == username && dict.get("password") == password) {
                return true;
            }
        }
        return false;

    }

    public static void signIn(String username, String password) {
        if (isUserValid(username, password)) {
            System.out.println(newsfeed());
        } else {
            System.out.println("Bad username or password");
        }
    }

}