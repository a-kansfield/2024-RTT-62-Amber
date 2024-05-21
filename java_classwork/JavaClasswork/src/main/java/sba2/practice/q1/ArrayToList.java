package sba2.practice.q1;

import java.util.ArrayList;

public class ArrayToList {
    private ArrayList<String> arrayToList;

    public ArrayToList() {
        arrayToList = new ArrayList<>();
    }

    void convert(String[] a) {
        for (int i = 0; i < a.length; i++) {
            arrayToList.add(a[i]);
            System.out.println("I have added the string: " + a[i] + " at the index: " + i);
        }
    }

    void replace(int in) {
        String value = arrayToList.get(in);
        arrayToList.set(in, "");
        System.out.println("I have replaced the string: "+ value +" with a null string.");
    }

    public ArrayList<String> compact() {
        ArrayList<String> result = new ArrayList<>();

        for (String s : arrayToList) {
            if (!s.equals("")) {
                result.add(s);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "ArrayToList{" +
                "arrayToList=" + arrayToList +
                '}';
    }
}
