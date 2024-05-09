package glab_303_11_1;

public class MyRunner2 {
    public static void main(String[] args) {
        // Initialize Generic Class with String and int data

        GMultipleDatatype<String, Integer> mObj = new GMultipleDatatype("Per Scholas", 11025);
        System.out.println(mObj.getValueOne());
        System.out.println(mObj.getValueTwo());

        // Initialize generic class with String and String data
        GMultipleDatatype<String, String> mObj2 = new GMultipleDatatype("Per Scholas", "Nonprofit");
        System.out.println(mObj2.getValueOne());
        System.out.println(mObj2.getValueTwo());
    }
}
