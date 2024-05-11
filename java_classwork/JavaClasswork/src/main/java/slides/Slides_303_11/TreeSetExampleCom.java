package slides.Slides_303_11;

import glab_303_11_5.citiesComparator;

import java.util.TreeSet;

public class TreeSetExampleCom {
    public static void main(String[] args) {
        //Create a TreeSet with user-defined comparator
        TreeSet<String> cities = new TreeSet<>(new citiesComparator());

        //add elements to the comparator
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        // Print the contents of TreeSet
        System.out.println("TreeSet: " + cities);
    }
}
