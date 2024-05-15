package slides.Slides_303_11;

import java.util.HashMap;

public class ExampleThree {
    //Write a Java program to copy all mappings from the specified map to another map.
    public static void main(String[] args) {
        HashMap<Integer,String> hash_map1 = new HashMap<Integer,String>();
        HashMap<Integer,String> hash_map2 = new HashMap<Integer,String>();

        // Populate Hash Maps
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        System.out.println("\nValues in first map: " + hash_map1);

        hash_map2.put(4, "White");
        hash_map2.put(5, "Blue");
        hash_map2.put(6, "Orange");
        System.out.println("\nValues in second map: " + hash_map2);

        //Put all values in second map
        hash_map2.putAll(hash_map1);
        System.out.println("\nNow values in second map: " + hash_map2);


    }
}
