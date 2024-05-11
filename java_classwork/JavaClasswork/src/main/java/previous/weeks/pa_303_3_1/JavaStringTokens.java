package previous.weeks.pa_303_3_1;

public class JavaStringTokens {
    public static void main (String args[]) {
        String s = "He is a very very good boy, isn't he?";
        String[] sSplit = s.split("[^A-Za-z]+");            // Note : Ask about .split and regex. Seem to be having issues
        System.out.println(sSplit.length);                        // Got solution from hackerrank discussions

        for (String tkn : sSplit) {                               // Didn't realize Java had a foreach equivalent. Nice!
            System.out.println(tkn);
        }


    }
}
