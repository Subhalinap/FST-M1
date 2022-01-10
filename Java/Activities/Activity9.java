package Activities;

import java.util.ArrayList;

public class Activity9 {
        public static void main(String[] args) {
            ArrayList<String> myList = new ArrayList<String>();
            myList.add("Subhalina");
            myList.add("Nick");
            myList.add("John");
            myList.add("Subha");
            myList.add("Vicky");
            for (String name:myList) {
                System.out.println(name);
            }
            System.out.println("3rd name in the ArrayList: " +myList.get(2));
            System.out.println("Number of names in the ArrayList: " +myList.size());
            System.out.println("Is Vicky in the list: " +myList.contains("Vicky"));
            myList.remove(4);
            System.out.println("Number of names in the ArrayList after removing value: " +myList.size());

        }
}
