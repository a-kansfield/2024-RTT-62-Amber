package pa_303_11_1;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {
    /*
    The first line will have an integer denoting the number of entries in the phone book.
    Each entry consists of two lines: a name and the corresponding phone number.

    After these, there will be some queries. Each query will contain a person's name.
    Read the queries until end-of-file.

    Constraints:
    A person's name consists of only lower-case English letters
    and it may be in the format 'first-name last-name' or in the format 'first-name'.
    Each phone number has exactly 8 digits without any leading zeros.
     */

    // Shown as incorrect in HackerRank despite claiming to have the same output?
    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int nEntry;
        String query = "default";

        nEntry = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < nEntry; i++) {
            phoneBook.put(scan.nextLine(), Integer.parseInt(scan.nextLine()));

        }
        while (query != "exit") {
            query = scan.nextLine();
            if (phoneBook.containsKey(query)){
                System.out.println(query +"="+ phoneBook.get(query));
            } else if (query == "exit"){
                break;
            } else {
                System.out.println("Not found");
            }
        }
    }
}
