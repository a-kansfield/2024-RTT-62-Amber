package slides.Slides_303_11;

import java.util.HashMap;

public class ExampleFive {
    public static void main(String[] args) {
        HashMap<Integer,String> hash_map = new HashMap <Integer,String> ();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        // Check if map is empty
        boolean result = hash_map.isEmpty();

        // Check the result
        System.out.println("Is hash map empty: " + result);

        // Remove all elements from the linked map
        hash_map.clear();

        // Check if map is empty
        result = hash_map.isEmpty();
        System.out.println("Is hash map empty: " + result);
    }
}
