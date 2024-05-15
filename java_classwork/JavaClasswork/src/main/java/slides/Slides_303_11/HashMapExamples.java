package slides.Slides_303_11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExamples {
    public static void main(String[] args) {

        Map<String, String> stringMap = new HashMap<>();

        stringMap.put("key", "value");
        stringMap.put("key2", "value2");
        stringMap.put(null, "actual value");
        stringMap.put("null value", null);
        stringMap.put("null value 1", null);

        // Adding null a 2nd time, which will overwrite the existing value
        stringMap.put(null, "actual value 1234");

        // It will overwrite a non-null key as well
        stringMap.put("key", "value 1234");

        // Prints out each set of key value pairs
        for ( String key: stringMap.keySet()) {
            System.out.println(key + " == " + stringMap.get(key));
        }

        // In this case, the key is an int and the value is a string
        Map<Integer, String> intMap = new HashMap<>();
        intMap.put(10, "ten");

        // This happens sometimes (value is list), but usually there are other ways of solving this problem
        Map<String, List<String>> listMap = new HashMap<>();

        // This happens when working with ad hoc queries
        // This is going to happen far more often than the map of list
        // When it comes back from the database this way we just treat it as a read only object
        List<Map<String, Object>> queryResult;


    }
}
