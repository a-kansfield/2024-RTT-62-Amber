package demo.java;

public class FirstJavaClass {
    public static void main(String args[]) {
        byte num;   // This can hold whole number between -128 and 127.
        num = 113;
        System.out.println(num);

        short snum;
        snum = 150;
        System.out.println(snum);

        long lnum = -12332252626L;
        System.out.println(lnum);

        double dnum = -42937737.9d;
        System.out.println(dnum);
        float fnum = 19.98f;
        System.out.println(fnum);

        boolean b = false;
        System.out.println(b);

        char ch = 'Z';
        System.out.println(ch);

        //Lesson 303.2 Slide 28 - Character Literals - Escape Sequences
        System.out.println("This will print on \r\ntwo lines.");
        System.out.println("She said \"Hello\" to me!");
        System.out.println("This will print two back-slashes: \\\\");
    }
}
