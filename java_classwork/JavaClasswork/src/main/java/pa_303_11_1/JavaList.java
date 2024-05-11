package pa_303_11_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Sample Input
/*
    5
    12 0 1 78 12
    2
    Insert
    5 23
    Delete
    0
 */

public class JavaList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int qNum;
        String query;

        // Initial array
        int size = scan.nextInt();
        for (int i = 0; i < size; i++) {
            list.add(scan.nextInt());
        }

        // Get query num
        qNum = scan.nextInt();
        for (int i = 0; i < qNum; i++){
            query = scan.next();
            switch (query){
                case "Insert":
                    list.add(scan.nextInt(), scan.nextInt());
                    break;
                case "Delete":
                    list.remove(scan.nextInt());
                    break;
                default:
                    System.out.println("Incorrect Query");
                    i -= 1;
            }
        }
        for (int num : list){
            System.out.print(num);
        }
        //System.out.println(list);

    }
}