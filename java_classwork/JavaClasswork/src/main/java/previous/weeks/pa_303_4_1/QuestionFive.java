package previous.weeks.pa_303_4_1;

import java.util.Scanner;

public class QuestionFive {
    // Write a program that uses if-else-if statements to print out grades A, B, C, D, F,
    // according to the following criteria:
    //A: 90-100
    //B: 80-89
    //C: 70-79
    //D: 60-69
    //F: <60
    //Use the Scanner class to accept a number score from the user to determine the letter grade.
    // Print out “Score out of range” if the score is less than 0 or greater than 100.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade = getGrade(scan);

        if ((grade <= 100) && (grade >= 90)) {          // A: 90-100
            System.out.println("Grade: A");
        } else if ((grade <= 89) && (grade >= 80)){     // B: 80-89
            System.out.println("Grade: B");
        } else if ((grade <= 79) && (grade >= 70)){     // C: 70-79
            System.out.println("Grade: C");
        } else if ((grade <= 69) && (grade >= 60)){     // D: 60-69
            System.out.println("Grade: D");
        } else if (grade < 60){     // F: <60
            System.out.println("Grade: F");
        } else {                                        // Out of range
            System.out.println("Out of range");
        }






    }
    // Get user input grade
    public static int getGrade(Scanner scan) {
        System.out.print("Input your grade percentage as a number between 0 and 100: ");
        return scan.nextInt();
    }
}
