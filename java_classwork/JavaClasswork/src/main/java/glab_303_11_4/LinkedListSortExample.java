package glab_303_11_4;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSortExample {
    public static void main(String[] args) {
        // Create Linked List
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");

        // Unsorted
        System.out.println(linkedList);

        // 1. Sort the list
        Collections.sort(linkedList);

        // Sorted
        System.out.println(linkedList);

        // 2. Custom Sorting
        Collections.sort(linkedList, Collections.reverseOrder());

        // Custom Sorted
        System.out.println(linkedList);

    }
}
