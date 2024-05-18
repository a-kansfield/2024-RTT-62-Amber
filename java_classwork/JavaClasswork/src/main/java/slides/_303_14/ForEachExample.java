package slides._303_14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        // printing all the names in the list
        names.add("Larry");
        names.add("Steve");
        names.add("James");
        names.add("Conan");
        names.add("Ellen");

        names.forEach(name -> System.out.println(name));

        // using lambda to remove items from the list
        names = names.stream().filter(name -> !name.startsWith("E")).collect(Collectors.toList());

        System.out.println("=================================");

        // print the list after the items are removed
        for (String name : names) {
            System.out.println(name);
        }

        // count the number of names in the list that starts with J
        long count = names.stream().filter(name -> name.startsWith("J")).count();
    }

}
