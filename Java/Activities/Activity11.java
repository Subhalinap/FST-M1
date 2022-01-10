package Activities;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Activity11 {
    public static void main(String[] args)
    {
        HashMap<Integer,String> colours = new HashMap<Integer, String>();
        colours.put(1, "Black");
        colours.put(2, "White");
        colours.put(3, "Green");
        colours.put(4, "Red");
        colours.put(5, "Blue");
        System.out.println("Removing colour: " +colours.remove(2));
        System.out.println("Does green exist in the HashMap: " +colours.containsValue("Green"));
        System.out.println("Size of the HashMap: " +colours.size());
    }
}
