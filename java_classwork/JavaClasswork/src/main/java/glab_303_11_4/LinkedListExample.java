package glab_303_11_4;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        /* Linked List Declaration */
        LinkedList<String> linkedList = new LinkedList<String>();

        /*add(String Element) is used for adding
         * the elements to the linked list*/
        linkedList.add("Item1");
        linkedList.add("Item5");
        linkedList.add("Item3");
        linkedList.add("Item6");
        linkedList.add("Item2");

        /*Display Linked List Content*/
        System.out.println("Linked List Content: " + linkedList);

        /*Add First and Last Element*/
        linkedList.addFirst("First Item");
        linkedList.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " + linkedList);

        /*This is how to get and set Values*/
        Object firstVar = linkedList.get(0);
        System.out.println("First element: " + firstVar);
        linkedList.set(0, "Changed first item");
        Object firstVar2 = linkedList.get(0);
        System.out.println("First element after update by set method: " + firstVar2);

        /*Remove first and last element*/
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + linkedList);

        /* Add to a Position and remove from a position*/
        linkedList.add(0, "Newly added item");
        linkedList.remove(2);
        System.out.println("Final Content: " + linkedList);



    }
}
