package sba2.practice.q1;

public class TestRunner {
    public static void main(String[] args) {
        String[] firstArray = {"a", "b", "c", "d"};
        ArrayToList arrayList = new ArrayToList();

        arrayList.convert(firstArray);
        arrayList.replace(2);
        arrayList.replace(1);

        System.out.println(arrayList.compact());


    }
}
