package slides.slides_303_12;

public class ExceptionExamples {
    public static void main(String[] args) {
        int[] array = new int[10];

        try {
            array[11] = 5;
        } catch (Exception e){
            System.out.println("Caught the exception e with message : " + e.getMessage());
        }


    }
}
