package misc.college;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;


// Creates a student object and adds to the csv file
public class StudentEnroll {
    protected Scanner scan = new Scanner(System.in);

    public StudentEnroll() {

    } //Default/empty constructor

    public String requestName() {
        System.out.print("Name: ");
        return scan.nextLine();
    }

    public String requestMajor() {
        System.out.print("Major: ");
        return scan.nextLine();
    }

    public int requestAge() {
        System.out.print("Age: ");
        return scan.nextInt();
    }

    public void saveEntry(Student s, File file) throws Exception{
        FileWriter writer = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(writer);
        StringJoiner sj = new StringJoiner(",");

        sj.add(s.getStudentID() + "")
                .add(s.getName())
                .add("" + s.getAge())
                .add(s.getMajor())
                .add("" + s.getGpa());

            writer.append("\n" + sj);
            //writer.append.(sj.add("\n" + student.getStudentID());
            writer.close();
    }
}


