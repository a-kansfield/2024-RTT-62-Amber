package slides.Slides_303_11;

import java.util.HashMap;

public class ExampleSeven {
    public static void main(String[] args) {
        HashMap< String, Integer > hash_map = new HashMap < String, Integer > ();
        hash_map.put("Red", 1);
        hash_map.put("Green", 2);
        hash_map.put("Black", 3);
        hash_map.put("White", 4);
        hash_map.put("Blue", 5);

        // Print the map
        System.out.println("The Original map: " + hash_map);

        System.out.println("1. Does key 'Green' exist?");
        if (hash_map.containsKey("Green")) {
            // Key exists
            System.out.println("yes! - " + hash_map.get("Green"));
        } else {
            // Key does not exist
            System.out.println("no!");
        }


    }
}
