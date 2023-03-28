import java.util.*;
class Practice01 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) {

        // ARRAYLIST();
        // ArrayListMethods();
        // ArrayListLoop();
        // ArrayListMultidimensional();

        // LINKEDLIST();
        // LinkedListMethods();
        // LinkedListLoop();
        // LinkedListMultidimensional();

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////// Array Lists

    public static void ARRAYLIST() {

        ArrayList<Integer> integersList = new ArrayList<Integer>();
        integersList.add(0);
        integersList.add(1); // Appends the specified element to the end of this list.
        System.out.println("Integers list: " + integersList);

        ArrayList<Number> numbersList = new ArrayList<Number>();
        numbersList.add(2);
        numbersList.add(3.45);
        System.out.println("Numbers list: " + numbersList);

        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Doro");
        stringList.add("Stef");
        stringList.add("Iulia");
        stringList.add("Maria");
        System.out.println("String list: " + stringList);

        ArrayList<Object> objectsList = new ArrayList<Object>();
        objectsList.add(234);
        objectsList.add("Object List entry");
        System.out.println("Object list: " + objectsList);

        ArrayList newObjectsList = new ArrayList(); // Object ArrayList!
        newObjectsList.add(234);
        newObjectsList.add("Object List entry");
        System.out.println("New Object list: " + newObjectsList);

        ArrayList newObjectStrigList = new ArrayList<String>(); // Still an Object ArrayList!
        newObjectStrigList.add("Test");
        newObjectStrigList.add("String List entry");
        newObjectStrigList.add(2);
        System.out.println("New Object list strings: " + newObjectStrigList);

        ArrayList<String> newObjectStrigListFixed = new ArrayList<>(); // String ArrayList!
        newObjectStrigListFixed.add("Test");
        newObjectStrigListFixed.add("String List entry");
        System.out.println("New Object list strings: " + newObjectStrigListFixed);

        // You can also specify the capacity of an array list (initial capacity is 10 if
        // not specified):

        ArrayList arrayListWithSize = new ArrayList<>(2);
        arrayListWithSize.add("df");
        arrayListWithSize.add(23);
        arrayListWithSize.add(333); // resize req.
        System.out.println("Array list with given size: " + arrayListWithSize);

        // You can specify the data type as List (the interface);

        List<Object> arrayListInterf = new ArrayList<>();
        arrayListInterf.add("df");
        arrayListInterf.add(23);
        arrayListInterf.add(333); // resize req.
        System.out.println("Array list with List interface as data type: " + arrayListInterf);

    }

    public static void ArrayListMethods() {

        // Add new items:

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Dacia");
        cars.add("Renault");
        cars.add("Fiat");
        cars.add("Ferrari");
        cars.add("Peugeot");
        cars.add("Mercedes");

        System.out.println("Add new items: " + cars);

        // Add new items at position(extends the list):

        cars.add(1, "Skoda");
        System.out.println("Add new items: " + cars);

        cars.add(1, "Datsun");
        System.out.println("Add new items: " + cars);

        // List size:

        System.out.println("List size: " + cars.size());

        // Accessing list items:

        System.out.println("Get items: " + cars.get(1));
        System.out.println("Get items: " + cars.indexOf("Ford"));

        // Adding items at position:

        cars.subList(3, 3).add("Trabant");
        System.out.println(cars);

        // Creating new variables from list items:

        String oneCar = cars.get(0); // cars.get(0) its an object
        System.out.println("New variable: " + oneCar);

        // Changing an item (replaces the element at the specified position in this list
        // with the specified element):

        cars.set(0, "Opel");
        System.out.println("Setting new value for Volvo: " + cars);

        // Create new list from existing list:

        List newCars = new ArrayList();
        newCars = cars;
        System.out.println("New car list: " + newCars);

        List secondCar = new ArrayList();
        secondCar = cars.subList(0, 2);
        System.out.println("New cars list: " + secondCar);

        List thirdCar = new ArrayList<>(newCars);
        System.out.println("New cars list: " + thirdCar);

        // Concatenate arrayLists:

        List oldCars = new ArrayList();
        oldCars.add("Pontiac");
        oldCars.add("Datsun");

        cars.addAll(oldCars);
        System.out.println("Contactenated list: " + cars);

        // Sort/reverse array lists:

        Collections.sort(cars);
        System.out.println("Sorted list: " + cars);

        Collections.reverse(cars);
        System.out.println("Reversed list: " + cars);

        // Check if element exists:

        if (cars.contains("Fddord")) {
            System.out.println("Element exists in the list: " + true);
        } else {
            System.out.println("Element exists in the list: " + false);
        }

        // Removing item/ item range:

        cars.remove(5);
        System.out.println("List without value from index 5: " + cars);

        cars.subList(0, 2).clear();
        System.out.println("New list after remove range: " + cars);

        // Removing the last element:

        cars.remove(cars.size() - 1);
        System.out.println("Removed last element: " + cars);

        // Remove all elements:

        cars.clear();
        System.out.println(cars);

        // Remove common elements

        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        listOne.removeAll(listTwo); // remove all common elements of second list
        System.out.println("Removed all elements of second listfound in first list: " + listOne); // f

        // Remove different elements (keep common elements)

        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));
        ArrayList<String> listFour = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        listThree.retainAll(listFour);
        System.out.println("Common elements: " + listThree);

    }

    public static void ArrayListLoop() {

        ArrayList cars = new ArrayList();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("ArrayList loop: " + cars.get(i));

        }

        // For each:

        ArrayList oldCars = new ArrayList<String>(); // note new ArrayList<String>()
        oldCars.add("Trabant");
        oldCars.add("Lada");
        oldCars.add("Skoda");
        oldCars.add("Oltcit");
        for (Object i : oldCars) { // If set as String i => errors out "Object cannot be converted to String"
            System.out.println("ArrayListString loop: " + i);
        }

        ArrayList<String> oldCarsStringFix = new ArrayList<>(); // note ArrayList<String>
        oldCarsStringFix.add("Trabant");
        oldCarsStringFix.add("Lada");
        oldCarsStringFix.add("Skoda");
        oldCarsStringFix.add("Oltcit");
        for (String i : oldCarsStringFix) {
            System.out.println("ArrayListStringFix loop: " + i);
        }

        // Iterator:

        ArrayList oldCarsStringBreak = new ArrayList<>(); // note ArrayList<String>
        oldCarsStringBreak.add("Merco");
        oldCarsStringBreak.add("Bimmer");
        oldCarsStringBreak.add("Lambo");
        oldCarsStringBreak.add("Rarri");
        Iterator iterOut1 = oldCarsStringBreak.iterator();
        while (iterOut1.hasNext()) {
            System.out.println("oldCarsStringBreak loop: " + iterOut1.next());
        }

    }

    public static void ArrayListMultidimensional() {

        ArrayList<ArrayList> listOfLists = new ArrayList();
        listOfLists.add(new ArrayList());
        listOfLists.add(new ArrayList());
        listOfLists.get(0).add("First list");
        listOfLists.get(0).add(1);
        listOfLists.get(1).add("Second list");
        listOfLists.get(1).add(2);

        System.out.println("Print linked list: " + listOfLists);

        // For & For
        for (int i = 0; i < listOfLists.size(); i++) {
            ArrayList obj = new ArrayList();
            obj = listOfLists.get(i);
            for (int j = 0; j < obj.size(); j++) {
                System.out.print("For & For:" + obj.get(j) + " ");
            }
            System.out.print('\n');
        }

        // For & Iterator
        for (int i = 0; i < listOfLists.size(); i++) {
            ArrayList obj = new ArrayList();

            Iterator iterin = obj.iterator();
            while (iterin.hasNext()) {
                System.out.println("For & Iterator: " + iterin.next());
            }
        }

        Iterator iterOut1 = listOfLists.iterator();
        while (iterOut1.hasNext()) {
            System.out.println("Iterator print each inner linkedlist: " + iterOut1.next());
        }

        // Iterator & For:
        Iterator iterOut2 = listOfLists.iterator();
        while (iterOut2.hasNext()) {
            ArrayList arint = (ArrayList) iterOut2.next();

            for (int i = 0; i < arint.size(); i++) {
                System.out.println("Iterator & For: " + arint.get(i));
            }
        }

        // Iterator & ForEach:
        Iterator iterOutForEach = listOfLists.iterator();
        while (iterOutForEach.hasNext()) {
            ArrayList arint = (ArrayList) iterOutForEach.next();

            for (Object i : arint) {
                System.out.println("Iterator & ForEach: " + i);
            }
        }

        // ForEach & iterator:
        for (ArrayList inner : listOfLists) {
            Iterator iterIn = inner.iterator();

            while (iterIn.hasNext()) {
                System.out.println("ForEach & iterator: " + iterIn.next());
            }
        }

        // ForEach & ForEach (BEST):
        for (ArrayList inner : listOfLists) {
            for (Object i : inner) {
                System.out.println("ForEach & ForEach: " + i);
            }
        }

        // ForEach & For:
        for (ArrayList inner : listOfLists) {
            for (int i = 0; i < inner.size(); i++) {
                System.out.println("ForEach & For: " + inner.get(i));
            }
        }

        // For & ForEach:
        for (int i = 0; i < listOfLists.size(); i++) {
            ArrayList obj = new ArrayList();
            for (Object inner : obj) {
                System.out.print("For & ForEach:" + inner);
            }
        }

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////// Linked Lists

    public static void LINKEDLIST() {

        LinkedList<Integer> integersList = new LinkedList<Integer>();
        integersList.add(0);
        integersList.add(1);
        System.out.println("Integers linked list: " + integersList);

        LinkedList<Number> numbersList = new LinkedList<Number>();
        numbersList.add(2);
        numbersList.add(3.45);
        System.out.println("Numbers linked list: " + numbersList);

        LinkedList<String> stringList = new LinkedList<String>();
        stringList.add("Doro");
        stringList.add("Stef");
        stringList.add("Iulia");
        stringList.add("Maria");
        System.out.println("String linked list: " + stringList);

        LinkedList<Object> objectsList = new LinkedList<Object>();
        objectsList.add(234);
        objectsList.add("Object linked list entry");
        System.out.println("Object linked list: " + objectsList);

        LinkedList newListObject = new LinkedList(); // Object linked list
        newListObject.add(0);
        newListObject.add("New link lists are better");
        System.out.println("Linked list: " + newListObject);

        LinkedList newIntegerList = new LinkedList<Integer>(); // Still an Object linked list
        newIntegerList.add(0);
        newIntegerList.add(1);
        newIntegerList.add("Test");
        System.out.println("Linked list: " + newIntegerList);

        LinkedList<String> newIntegerListFixed = new LinkedList<>(); // String ArrayList!
        newIntegerListFixed.add("Test");
        newIntegerListFixed.add("String List entry");
        System.out.println("New Object list strings: " + newIntegerListFixed);

    }

    public static void LinkedListMethods() {

        // Add new items:

        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo"); // appends at the end of the list!
        cars.add("BMW");
        cars.add(1, "Ford"); // inserts the specified element at the specified position in this list.
        cars.add("Mazda");
        cars.add("Dacia");
        cars.add("Renault");
        cars.add("Fiat");
        cars.add("Ferrari");
        cars.add("Peugeot");
        cars.add("Mercedes");

        cars.addFirst("Audi"); // new for LinkedLIst
        cars.addLast("Rolls"); // new for LinkedLIst

        cars.push("Lastun"); // inserts the specified element at the front of the list

        System.out.println("Linked list items: " + cars);

        // Add new items at specified position(extends the list):

        cars.add(1, "Skoda");
        System.out.println("Add new items: " + cars);

        cars.add(1, "Datsun");
        System.out.println("Add new items: " + cars);

        // List size:

        System.out.println("Linked List size: " + cars.size());

        // Accessing list items:

        System.out.println("Get items: " + cars.get(1));
        System.out.println("Get items: " + cars.indexOf("Ford"));

        System.out.println("Get first item: " + cars.getFirst()); // new for LinkedLIst
        System.out.println("Get last item: " + cars.getLast()); // new for LinkedLIst

        System.out.println("Peek first item: " + cars.peek());
        System.out.println("Peek first item: " + cars.peekFirst());
        System.out.println("Peek last item: " + cars.peekLast());

        // Adding items at position:

        cars.subList(3, 3).add("Trabant");
        System.out.println(cars);

        // Creating new variables from list items:

        Object oneCar = cars.get(0); // cars.get(0) is an object
        System.out.println("New variable: " + oneCar);

        // Changeing an item:

        cars.set(0, "Opel");
        System.out.println("Setting new value for Volvo: " + cars);

        // Create new list from existing list:

        LinkedList newCars = new LinkedList();
        newCars = cars;
        System.out.println("New car list: " + newCars);

        List secondCar = cars.subList(0, 2);

        System.out.println("New cars list: " + secondCar);

        LinkedList thirdCar = new LinkedList<>(newCars);
        System.out.println("New cars list: " + thirdCar);

        // Concatenate arrayLists:

        LinkedList oldCars = new LinkedList();
        oldCars.add("Pontiac");
        oldCars.add("Datsun");

        cars.addAll(oldCars);
        System.out.println("Contactenated list: " + cars);

        // Sort/reverse array lists:

        Collections.sort(cars);
        System.out.println("Sorted list: " + cars);

        Collections.reverse(cars);
        System.out.println("Reversed list: " + cars);

        // Check if element exists:

        if (cars.contains("Fddord")) {
            System.out.println("Element exists in the list: " + true);
        } else {
            System.out.println("Element exists in the list: " + false);
        }

        // Removing item/ item range:

        System.out.println("List before removing elements " + cars);
        cars.remove(); // removes first item in the list
        cars.remove(5); // removes 5th item in the list
        cars.pop(); // removes first item in the list
        System.out.println("List without value from index 5: " + cars);

        cars.subList(0, 2).clear();
        System.out.println("New list after remove range: " + cars);

        cars.removeFirst(); // new for LinkedLIst
        cars.removeLast(); // new for LinkedLIst
        System.out.println("New list after remove first and last: " + cars);

        // Removing the last element:

        cars.remove(cars.size() - 1);
        System.out.println("Removed last element: " + cars);

        // Remove all elements:

        cars.clear();
        System.out.println(cars);

        // Remove common elements

        LinkedList<String> listOne = new LinkedList<>(Arrays.asList("a", "b", "c", "d", "f"));
        LinkedList<String> listTwo = new LinkedList<>(Arrays.asList("a", "b", "c", "d", "e"));
        listOne.removeAll(listTwo); // remove all common elements of second list
        System.out.println("Removed all elements of second listfound in first list: " + listOne); // f

        // Remove different elements (keep common elements)

        LinkedList<String> listThree = new LinkedList<>(Arrays.asList("a", "b", "c", "d", "f"));
        LinkedList<String> listFour = new LinkedList<>(Arrays.asList("a", "b", "c", "d", "e"));
        listThree.retainAll(listFour);
        System.out.println("Common elements: " + listThree);

        // Retrieve and remove the first/last element of this list

        LinkedList<String> listFive = new LinkedList<>(Arrays.asList("a", "b", "c", "d", "f"));
        System.out.println("Retrive and remove first element: " + listFive.pollFirst());
        System.out.println("Retrive and remove last element: " + listFive.pollLast());
        System.out.println("New list elements: " + listFive);
    }

    public static void LinkedListLoop() {

        LinkedList cars = new LinkedList();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("LinkedList loop: " + cars.get(i));

        }

        // For each:

        LinkedList oldCars = new LinkedList();
        oldCars.add("Trabant");
        oldCars.add("Lada");
        oldCars.add("Skoda");
        oldCars.add("Oltcit");
        for (Object i : oldCars) { // String i => Object cannot be converted to String
            System.out.println("LinkedList loop: " + i);
        }

        // Iterator:

        LinkedList oldCarsStringBreak = new LinkedList<>(); // note ArrayList<String>
        oldCarsStringBreak.add("Merco");
        oldCarsStringBreak.add("Bimmer");
        oldCarsStringBreak.add("Lambo");
        oldCarsStringBreak.add("Rarri");
        Iterator iterOut1 = oldCarsStringBreak.iterator();
        while (iterOut1.hasNext()) {
            System.out.println("LinkedList oldCarsStringBreak loop: " + iterOut1.next());
        }

    }

    public static void LinkedListMultidimensional() {

        LinkedList<LinkedList> listOfLists = new LinkedList();
        listOfLists.add(new LinkedList());
        listOfLists.add(new LinkedList());
        listOfLists.get(0).add("First list");
        listOfLists.get(0).add(1);
        listOfLists.get(1).add("Second list");
        listOfLists.get(1).add(2);

        System.out.println("Print linked list: " + listOfLists);

        // For & For
        for (int i = 0; i < listOfLists.size(); i++) {
            LinkedList obj = new LinkedList();
            obj = listOfLists.get(i);
            for (int j = 0; j < obj.size(); j++) {
                System.out.print("For & For:" + obj.get(j) + " ");
            }
            System.out.print('\n');
        }

        // For & Iterator

        for (int i = 0; i < listOfLists.size(); i++) {
            LinkedList obj = new LinkedList();

            Iterator iterin = obj.iterator();
            while (iterin.hasNext()) {
                System.out.println("For & Iterator: " + iterin.next());
            }
        }

        Iterator iterOut1 = listOfLists.iterator();
        while (iterOut1.hasNext()) {
            System.out.println("Iterator print each inner linkedlist: " + iterOut1.next());
        }

        // Iterator & For

        Iterator iterOut2 = listOfLists.iterator();
        while (iterOut2.hasNext()) {
            LinkedList arint = (LinkedList) iterOut2.next();

            for (int i = 0; i < arint.size(); i++) {
                System.out.println("Iterator & For: " + arint.get(i));
            }
        }

        // Iterator & ForEach

        Iterator iterOutForEach = listOfLists.iterator();
        while (iterOutForEach.hasNext()) {
            LinkedList arint = (LinkedList) iterOutForEach.next();

            for (Object i : arint) {
                System.out.println("Iterator & ForEach: " + i);
            }
        }

        // ForEach & iterator

        for (LinkedList inner : listOfLists) {
            Iterator iterIn = inner.iterator();

            while (iterIn.hasNext()) {
                System.out.println("ForEach & iterator: " + iterIn.next());
            }
        }

        // ForEach & ForEach

        for (LinkedList inner : listOfLists) {
            for (Object i : inner) {
                System.out.println("ForEach & ForEach: " + i);
            }
        }

        // ForEach & For

        for (LinkedList inner : listOfLists) {
            for (int i = 0; i < inner.size(); i++) {
                System.out.println("ForEach & For: " + inner.get(i));
            }
        }

        // For & ForEach

        for (int i = 0; i < listOfLists.size(); i++) {
            LinkedList obj = new LinkedList();
            for (Object inner : obj) {
                System.out.print("For & ForEach:" + inner);
            }
        }

    }

}
