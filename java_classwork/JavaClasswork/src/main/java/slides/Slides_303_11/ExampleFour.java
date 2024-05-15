package slides.Slides_303_11;

import java.util.HashMap;

public class ExampleFour {
    // Write a Java program to remove all mappings from a map.
    public static void main(String[] args) {
        HashMap<Integer,String> hash_map = new HashMap <Integer,String> ();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        //Print the map
        System.out.println("The Original linked map: " + hash_map);

        // Removing all the elements from the linked map
        hash_map.clear();
        System.out.println("The new map: " + hash_map);
    }
}
