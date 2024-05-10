package glab_303_11_5;
import java.util.Comparator;

public class citiesComparator implements Comparator<String>  {
    //Override compare method to compare two elements of the TreeSet
    @Override
    public int compare(String citiesOne, String citiesTwo) {
        int value = citiesOne.compareTo(citiesTwo);
        // Sort elements in reverse order
        if (value > 0 ) {
            return -1;
        } else if (value < 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
