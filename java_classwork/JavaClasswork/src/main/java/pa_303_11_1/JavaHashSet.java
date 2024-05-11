package pa_303_11_1;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum = Integer.parseInt(scan.nextLine());
        int uniquePairs;
        HashSet<String> pairs = new HashSet<>(inputNum);

        for (int i = 0; i < inputNum; i++){
            pairs.add(scan.nextLine());
            uniquePairs = pairs.size();
            System.out.println(uniquePairs);
        }
    }
}
