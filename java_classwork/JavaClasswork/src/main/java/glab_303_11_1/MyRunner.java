package glab_303_11_1;

public class MyRunner {
    public static void main(String[] args) {
        // Initialize the class with Integer data
        DemoClass dObj = new DemoClass();
        dObj.genericsMethod(25);            // Passing int
        dObj.genericsMethod("Per Scholas"); // Passing String
        dObj.genericsMethod(2563.5);        // Passing float
        dObj.genericsMethod('H');           // Passing char
    }
}
