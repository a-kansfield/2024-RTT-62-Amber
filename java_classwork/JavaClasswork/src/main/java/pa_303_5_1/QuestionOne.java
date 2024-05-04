package pa_303_5_1;

public class QuestionOne {
    // Write a program that uses nested for loops to print a multiplication table.
    public static void main(String[] args) {
        int max = 12;

        for (int i = 1 ; i <= max ; i++) {
            for (int j = 1 ; j <= max ; j++){
                System.out.print(i * j + "\t");
            }
                System.out.println();
        }
    }
}
