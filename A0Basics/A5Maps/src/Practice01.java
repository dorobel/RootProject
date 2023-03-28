
import java.util.*;

public class Practice01 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) {

        // HASHMAP();
        HashMapMethods();
        // HashMapLoop();
        HashMapMultidimensional();
    }

    public static void HASHMAP() {

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        HashMap<String, Integer> bankAccounts = new HashMap<String, Integer>();

        bankAccounts.put("Doro", 200);
        bankAccounts.put("Stef", 400);
        bankAccounts.put("Iulia", 1000);
        System.out.println(bankAccounts);

        HashMap cars = new HashMap<>();

        cars.put("Doro", "Merc");
        cars.put("Stef", "Toyota");
        cars.put(1, "ferrari");
        cars.put(2, 911);
        System.out.println(cars);

        // You can also specify the capacity of a map (initial capacity is 10 if
        // not specified):

        HashMap mapWithSize = new HashMap<>(2);
        mapWithSize.put("Doro", 200);
        mapWithSize.put("Norway", "Oslo");
        mapWithSize.put(333, 22); // resize req.
        System.out.println("HashMap with given size: " + mapWithSize);

        // You can specify the data type as Map (the interface); by using Map if you
        // decide later you want to change its easy to do it!

        Map<Object, Object> mapInterf = new HashMap<>();
        mapInterf.put("Doro", 200);
        mapInterf.put("Norway", "Oslo");
        mapInterf.put(333, 22);
        System.out.println("HashMap with interface Map as data type: " + mapInterf);
    }

    public static void HashMapMethods() {

        // Add new items:

        HashMap cars = new HashMap<>();

        cars.put("Doro", "Merc");
        cars.put("Stef", "Toyota");
        cars.put("Iulia", 911);
        System.out.println(cars);

        // Map size:

        System.out.println("Map size: " + cars.size());

        // Accessing list items:

        System.out.println("Access map by keys (Iulia): " + cars.get("Iulia"));

        // Displaying the cloned HashMap using clone()

        System.out.println("Clone hashmap from newcars: " + cars.clone());

        // Getting the keys:

        System.out.println("Getting the keys: " + cars.keySet());

        // Getting the values:

        System.out.println("Getting the values: " + cars.values());

        // Creating new variables from hash items:

        Object keyObName = cars.get("Doro");
        System.out.println("New variable: " + keyObName);

        // Changing an item:

        cars.put("Doro", "Mercedes");
        System.out.println("New value for Doro: " + cars.get("Doro"));

        cars.replace("Doro", "Mercedes Benz"); // returns true/false if used in decision blocks
        System.out.println("New value for Doro: " + cars.get("Doro"));

        cars.put("Doro", "Mercedes");
        System.out.println("New value for Doro: " + cars.get("Doro"));

        // Create new HashMap from existing HashMap:

        HashMap newCars = new HashMap<>();
        newCars = cars;

        System.out.println("New hashmap from cars: " + newCars);

        // Concatenate HashMap:

        Map oldCars = new HashMap<>();
        oldCars.put("Tata", "Dacie");

        cars.putAll(oldCars);
        System.out.println("Concatenare hashmaps: " + cars);

        // Check elements exists:

        System.out.println("Has key Doro: " + cars.containsKey("Doro"));
        System.out.println("Has value Dacie: " + cars.containsValue("Dacie"));
        System.out.println("Has any element: " + cars.isEmpty());

        // Remove elements (remove all the kw pairs with clear()):

        cars.remove("Doro"); // returns true/false if used in decision blocks
        System.out.println("Removed key Doro: " + cars);

        cars.remove("Iulia", 911);
        System.out.println("Removed key Iulia: " + cars);

        // Add lists as values for keys

        ArrayList carsModels = new ArrayList<>();
        carsModels.add("Lastun");
        carsModels.add("Skoda");
        carsModels.add("Moskwich");

        Map shopProducts = new HashMap<>();
        shopProducts.put("Models", carsModels);

        System.out.println(shopProducts);

    }

    public static void HashMapLoop() {

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // For each: print key and values with entrySet

        for (Map.Entry entry : capitalCities.entrySet()) {
            System.out.println(entry); // USA=Washington DC
            System.out.println("Entry set: " + entry.getKey() + " -> " + entry.getValue());
        }

        // For each: print keys and values with keySet

        for (String i : capitalCities.keySet()) {
            System.out.println(i); // USA
            System.out.println("Key set: " + i + " : " + capitalCities.get(i));
        }

        // For each: print values

        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Looping with iterators (EntrySet)

        HashMap<String, Integer> hme = new HashMap<String, Integer>();

        hme.put("GeeksforGeeks", 54);
        hme.put("A computer portal", 80);
        hme.put("For geeks", 82);

        Iterator hmIterator1 = hme.entrySet().iterator();

        while (hmIterator1.hasNext()) {
            Map.Entry mapElement = (Map.Entry) hmIterator1.next();
            System.out.println(mapElement.getKey() + " : " + mapElement.getValue());
        }

        // Looping with iterators (KeySet)

        HashMap<String, Integer> hmk = new HashMap<String, Integer>();

        hmk.put("GeeksforGeeks", 54);
        hmk.put("A computer portal", 80);
        hmk.put("For geeks", 82);

        Iterator hmIterator2 = hmk.keySet().iterator();

        while (hmIterator2.hasNext()) {
            System.out.println(hmk.get(hmIterator2.next()));
        }

    }

    public static void HashMapMultidimensional() {

        ////// Dictionaries as dictionaris values

        HashMap<String, HashMap> importantCities = new HashMap<>();
        importantCities.put("Romania", new HashMap<Integer, String>());
        importantCities.get("Romania").put(1, "Bucuresti");
        importantCities.get("Romania").put(2, "Cluj");
        importantCities.put("Franta", new HashMap<Integer, String>());
        importantCities.get("Franta").put(1, "Paris");
        importantCities.get("Franta").put(2, "Marsilia");
        System.out.println(importantCities);

        // For each / For each:

        for (String i : importantCities.keySet()) {
            for (Object j : importantCities.get(i).keySet()) {
                System.out.println("For each / For each KS/KS: " + importantCities.get(i).get(j));
            }
        }

        for (String i : importantCities.keySet()) {
            for (Object j : importantCities.get(i).entrySet()) {
                Map.Entry l = (Map.Entry) j;
                System.out.println("For each / For each KS/ES: " + l.getValue());
            }
        }

        for (Map.Entry i : importantCities.entrySet()) {
            for (Object j : importantCities.get(i.getKey()).keySet()) {
                System.out.println("For each / For each ES/KS:  " + importantCities.get(i.getKey()).get(j));
            }
        }

        for (Map.Entry i : importantCities.entrySet()) {
            for (Object j : importantCities.get(i.getKey()).entrySet()) {
                Map.Entry l = (Map.Entry) j;
                System.out.println("For each / For each ES/ES:  " + l.getValue());
            }
        }

        // For each / Iterator

        for (String i : importantCities.keySet()) {
            Iterator iterInt = importantCities.get(i).entrySet().iterator();

            while (iterInt.hasNext()) {
                Map.Entry mapElement = (Map.Entry) iterInt.next();
                System.out.println("For each KS / Iterator ES: " + mapElement.getKey() + " : " + mapElement.getValue());
            }
        }

        for (Map.Entry i : importantCities.entrySet()) {
            Iterator iterInt = importantCities.get(i.getKey()).entrySet().iterator();

            while (iterInt.hasNext()) {
                Map.Entry mapElement = (Map.Entry) iterInt.next();
                System.out.println("For each ES / Iterator ES: " + mapElement.getKey() + " : " + mapElement.getValue());
            }
        }

        for (Map.Entry i : importantCities.entrySet()) {
            Iterator iterInt = importantCities.get(i.getKey()).keySet().iterator();

            while (iterInt.hasNext()) {
                System.out.println("For each ES / Iterator KS: " + iterInt.next() + " : "
                        + importantCities.get(i.getKey()).get(iterInt.next()));
            }
        }

        for (String i : importantCities.keySet()) {
            Iterator iterInt = importantCities.get(i).keySet().iterator();

            while (iterInt.hasNext()) {
                System.out.println("For each KS / Iterator KS: " + iterInt.next() + " : "
                        + importantCities.get(i).get(iterInt.next()));
            }
        }

        // Iterator / Iterator

        Iterator iterc1 = importantCities.keySet().iterator();
        while (iterc1.hasNext()) {
            Iterator iterInt = importantCities.get(iterc1.next()).entrySet().iterator();

            while (iterInt.hasNext()) {
                Map.Entry mapElement = (Map.Entry) iterInt.next();
                System.out.println("Iterator KS / Iterator ES: " + mapElement.getKey() + " : " + mapElement.getValue());
            }
        }

        Iterator iterc2 = importantCities.entrySet().iterator();
        while (iterc2.hasNext()) {

            Map.Entry hmInt = (Map.Entry) iterc2.next();
            Iterator iterInt = importantCities.get(hmInt.getKey()).entrySet().iterator();

            while (iterInt.hasNext()) {
                Map.Entry mapElement = (Map.Entry) iterInt.next();
                System.out.println("Iterator ES / Iterator ES: " + mapElement.getKey() + " : " + mapElement.getValue());
            }
        }

        Iterator iterc3 = importantCities.keySet().iterator();
        while (iterc3.hasNext()) {
            String x = (String) iterc3.next();
            Iterator iterInt = importantCities.get(iterc3.next()).keySet().iterator();

            while (iterInt.hasNext()) {
                System.out.println("Iterator KS / Iterator KS: " + iterInt.next() + " : "
                        + importantCities.get(x).get(iterInt.next()));
            }
        }

        Iterator iterc4 = importantCities.entrySet().iterator();
        while (iterc4.hasNext()) {

            Map.Entry hmExt = (Map.Entry) iterc4.next();
            Iterator iterInt = importantCities.get(hmExt.getKey()).keySet().iterator();

            while (iterInt.hasNext()) {
                System.out.println("Iterator ES / Iterator KS: " + iterInt.next() + " : "
                        + importantCities.get(hmExt.getKey()).get(iterInt.next()));
            }
        }

        ///// Lists as dictionaries values

        HashMap<String, ArrayList> niceCities = new HashMap<>();
        niceCities.put("France", new ArrayList<String>());
        niceCities.get("France").add("Strasbourg");
        niceCities.get("France").add("Colmar");
        niceCities.put("Romania", new ArrayList<String>());
        niceCities.get("Romania").add("Predeal");
        niceCities.get("Romania").add("Sinaia");
        System.out.println("List as dictionaries values: " + niceCities);

        // For each / for each

        for (String i : niceCities.keySet()) {
            for (Object j : niceCities.get(i)) {
                System.out.println("Inner list value for each / for each: " + j);
            }
        }

        for (Map.Entry i : niceCities.entrySet()) {
            for (Object j : niceCities.get(i.getKey())) {
                System.out.println("Inner list value for each / for each: " + j);
            }
        }

        // For each / classic

        for (String i : niceCities.keySet()) {
            for (int j = 0; j < niceCities.get(i).size(); j++) {
                System.out.println("Inner list value for each / for classic: " + niceCities.get(i).get(j));
            }
        }

        for (Map.Entry i : niceCities.entrySet()) {
            for (int j = 0; j < niceCities.get(i.getKey()).size(); j++) {
                System.out.println("Inner list value for each / for classic: " + niceCities.get(i.getKey()).get(j));
            }
        }

        // For each / Iterator

        for (String i : niceCities.keySet()) {
            Iterator iter = niceCities.get(i).iterator();
            while (iter.hasNext()) {
                System.out.println("Inner list value for each / for iterator: " + iter.next());
            }
        }

        for (Map.Entry i : niceCities.entrySet()) {
            Iterator iter = niceCities.get(i.getKey()).iterator();
            while (iter.hasNext()) {
                System.out.println("Inner list value for each / for iterator: " + iter.next());
            }
        }

        // Iterator / For each

        Iterator niceOut1 = niceCities.entrySet().iterator();
        while (niceOut1.hasNext()) {
            Map.Entry es = (Map.Entry) niceOut1.next();
            ArrayList iterIn = (ArrayList) es.getValue();
            for (Object i : iterIn) {
                System.out.println("Inner list value Iterator ES/ for each :" + i);
            }

        }

        Iterator niceOut2 = niceCities.keySet().iterator();
        while (niceOut2.hasNext()) {
            String iterIn = (String) niceOut2.next();
            for (Object i : niceCities.get(iterIn)) {
                System.out.println("Inner list value Iterator KS/ for each :" + i);
            }

        }

        // Iterator / classic

        Iterator niceOut3 = niceCities.entrySet().iterator();
        while (niceOut3.hasNext()) {
            Map.Entry es = (Map.Entry) niceOut3.next();
            ArrayList innerAr = (ArrayList) es.getValue();
            for (int i = 0; i < innerAr.size(); i++) {
                System.out.println("Inner list value Iterator ES/ classic :" + innerAr.get(i));
            }
        }

        Iterator niceOut4 = niceCities.keySet().iterator();
        while (niceOut4.hasNext()) {
            String innerStr = (String) niceOut4.next();
            for (int i = 0; i < niceCities.get(innerStr).size(); i++) {
                System.out.println("Inner list value Iterator KS/ classic :" + niceCities.get(innerStr).get(i));
            }

        }

        // Iterator / Iterator

        Iterator niceOut5 = niceCities.entrySet().iterator();
        while (niceOut5.hasNext()) {
            Map.Entry es = (Map.Entry) niceOut5.next();
            ArrayList innerAr = (ArrayList) es.getValue();

            Iterator iterIn = innerAr.iterator();
            while (iterIn.hasNext()) {
                System.out.println("Inner list value Iterator ES/ iterator list:" + iterIn.next());
            }
        }

        Iterator niceOut6 = niceCities.keySet().iterator();
        while (niceOut6.hasNext()) {
            ArrayList innerAr = (ArrayList) niceCities.get(niceOut6.next());

            Iterator iterIn = innerAr.iterator();
            while (iterIn.hasNext()) {
                System.out.println("Inner list value Iterator KS/ iterator list:" + iterIn.next());
            }
        }

        ///// Dictionaries as list elements

        HashMap carsDict1 = new HashMap<>();

        carsDict1.put("Doro", "Merc");
        carsDict1.put("Stef", "Toyota");
        carsDict1.put("Iulia", "ferrari");

        HashMap carsDict2 = new HashMap<>();

        carsDict2.put("Doro", "Merc");
        carsDict2.put("Stef", "Toyota");
        carsDict2.put("Iulia", "ferrari");

        ArrayList clientsInfo = new ArrayList<>();
        clientsInfo.add(carsDict1);
        clientsInfo.add(carsDict2);
        System.out.println(clientsInfo);

        // For classic / for each

        for (int i = 0; i < clientsInfo.size(); i++) {
            HashMap<String, String> dict = (HashMap<String, String>) clientsInfo.get(i);

            for (String intern : dict.keySet()) {
                System.out.println("Dictionaries as list elements for classic / for each KS: " + dict.get(intern));
            }
        }

        for (int i = 0; i < clientsInfo.size(); i++) {
            HashMap<String, String> dict = (HashMap<String, String>) clientsInfo.get(i);

            for (Map.Entry intern : dict.entrySet()) {
                System.out.println("Dictionaries as list elements for classic / for each ES: " + intern.getValue());
            }
        }

        // for classic / iterator

        for (int i = 0; i < clientsInfo.size(); i++) {
            HashMap<String, String> dict = (HashMap<String, String>) clientsInfo.get(i);

            Iterator iterInt = dict.entrySet().iterator();
            while (iterInt.hasNext()) {
                Map.Entry mapInt = (Map.Entry) iterInt.next();
                System.out.println("Dictionaries as list elements for classic / iterator ES: " + mapInt.getValue());
            }
        }

        for (int i = 0; i < clientsInfo.size(); i++) {
            HashMap<String, String> dict = (HashMap<String, String>) clientsInfo.get(i);

            Iterator iterInt = dict.keySet().iterator();
            while (iterInt.hasNext()) {
                System.out.println(
                        "Dictionaries as list elements for classic / iterator KS: " + dict.get(iterInt.next()));
            }
        }

        // iterator / for each

        Iterator iterp1 = clientsInfo.iterator();
        while (iterp1.hasNext()) {
            HashMap<String, String> dict = (HashMap<String, String>) iterp1.next();

            for (String intern : dict.keySet()) {
                System.out.println("Dictionaries as list elements iterator / for each KS: " + dict.get(intern));
            }
        }

        Iterator iterp2 = clientsInfo.iterator();
        while (iterp2.hasNext()) {
            HashMap<String, String> dict = (HashMap<String, String>) iterp2.next();

            for (Map.Entry intern : dict.entrySet()) {
                System.out.println("Dictionaries as list elements iterator / for each ES: " + intern.getValue());
            }
        }

        // iterator / iterator

        Iterator iterd1 = clientsInfo.iterator();
        while (iterd1.hasNext()) {
            HashMap<String, String> dict = (HashMap<String, String>) iterd1.next();

            Iterator iterInt = dict.entrySet().iterator();
            while (iterInt.hasNext()) {
                Map.Entry mapInt = (Map.Entry) iterInt.next();
                System.out.println("Dictionaries as list elements iterator / iterator ES: " + mapInt.getValue());
            }
        }

        Iterator iterd2 = clientsInfo.iterator();
        while (iterd2.hasNext()) {
            HashMap<String, String> dict = (HashMap<String, String>) iterd2.next();

            Iterator iterInt = dict.keySet().iterator();
            while (iterInt.hasNext()) {
                System.out.println("Dictionaries as list elements iterator / iterator KS: " + dict.get(iterInt.next()));
            }
        }

        // For each / for each

        for (Object i : clientsInfo) {
            HashMap<String, String> intHm = (HashMap) i;

            for (Map.Entry intern : intHm.entrySet()) {
                System.out.println("Dictionaries as list elements for each / for each ES: " + intern.getValue());
            }
        }

        for (Object i : clientsInfo) {
            HashMap<String, String> intHm = (HashMap) i;

            for (String intern : intHm.keySet()) {
                System.out.println("Dictionaries as list elements for each / for each KS: " + intHm.get(intern));
            }
        }

        // For each / iterator

        for (Object i : clientsInfo) {
            HashMap<String, String> intHm = (HashMap) i;

            Iterator iterIn = intHm.keySet().iterator();
            while (iterIn.hasNext()) {
                System.out.println("Dictionaries as list elements for each / iterator ES: " + intHm.get(iterIn.next()));
            }
        }

        for (Object i : clientsInfo) {
            HashMap<String, String> intHm = (HashMap) i;

            Iterator iterIn = intHm.entrySet().iterator();
            while (iterIn.hasNext()) {
                Map.Entry intEn = (Map.Entry) iterIn.next();
                System.out.println("Dictionaries as list elements for each / iterator KS: " + intEn.getValue());
            }
        }

    }
}
