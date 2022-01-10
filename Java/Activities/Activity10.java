package Activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Subhalina");
        hs.add("Nick");
        hs.add("John");
        hs.add("Subha");
        hs.add("Vicky");
        hs.add("Kevin");
        System.out.println("Size of the HashSet: " +hs.size());
        hs.remove("Subha");
        hs.remove("Kim");
        System.out.println("Is Subhalina there in the Set: " +hs.contains("Subhalina"));

        System.out.println("HashSet values: ");
        for (String hsname:hs) {
            System.out.println(hsname);
        }
    }
}
