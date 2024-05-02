package glab_303_2_1;

public class OperatorsDemo {
    public static void main(String args[]) {
        assignmentOperatorsDemo();
        arithmeticOperatorsDemo();
        relationalOperatorsDemo();
        logicalOperatorsDemo();
        bitwiseOperatorsDemo();
        ternaryOperatorDemo();
        unaryOperatorDemo();
    }

    public static void assignmentOperatorsDemo() {
        header("Assignment Operators");
        // Assigning Primitive Values
        int j, k;
        j = 10; // j gets the value 10.
        j = 5;  // j gets the value 5. The previous value is overwritten.
        k = j;  // k gets the value 5.
        System.out.println("j is: " + j);
        System.out.println("k is: " + k);

        // Multiple assignments
        k = j = 10;     //(k = (j = 10))
        System.out.println("j is: " + j);
        System.out.println("k is: " + k);
    }

    public static void arithmeticOperatorsDemo() {
        header("Arithmetic Operators");

        int x,y = 10, z = 5;
        x = y + z;
        System.out.println("+ operator resulted in " + x);
        x = y - z;
        System.out.println("- operator resulted in " + x);
        x = y * z;
        System.out.println("* operator resulted in " + x);
        x = y / z;
        System.out.println("/ operator resulted in " + x);
        x = y % z;
        System.out.println("% operator resulted in " + x);
        x = y++;
        System.out.println("Postfix ++ operator resulted in " + x);
        x = ++z;
        System.out.println("Prefix ++ operator resulted in " + x);
        x = -y;
        System.out.println("Unary operator resulted in " + x);

        // Some examples of special cases
        int tooBig = Integer.MAX_VALUE + 1;     // -2147483648 which is Integer.MIN_VALUE.
        int tooSmall = Integer.MIN_VALUE -1;    // 2147483647 which is Integer.MAX_VALUE.

        System.out.println("tooBig becomes " + tooBig);
        System.out.println("tooSmall becomes " + tooSmall);
        System.out.println(4.0 / 0.0);          // Prints: Infinity
        System.out.println(-4.0 / 0.0);         // Prints: -Infinity
        System.out.println(0.0 / 0.0);          // Prints: NaN
        double d1 = 12 / 8;                     // Result: 1 by integer division. The val of d1 becomes 1.0
        double d2 = 12.0F / 8;                  // Result: 1.5
        System.out.println("d1 is " + d1);
        System.out.println("d2 is " + d2);


    }

    public static void relationalOperatorsDemo() {
        header("Relational Operators");

        int x = 10, y = 5;
        System.out.println("x > y : " +(x > y));
        System.out.println("x < y :" +(x < y));
        System.out.println("x >= y :" +(x >= y));
        System.out.println("x <= y :" +(x <= y));
        System.out.println("x == y :" +(x == y));
        System.out.println("x != y :" +(x != y));

        int variable1 = 50, variable2 = 100, variable3 = 50;
        System.out.println("variable1 = " + variable1);
        System.out.println("variable2 = " + variable2);
        System.out.println("variable3 = " + variable3);
        System.out.println("variable1 == variable2: " + (variable1 == variable2));
        System.out.println("variable1 == variable3: " + (variable1 == variable3));
    }

    public static void logicalOperatorsDemo() {
        header("Logical Operators");

        boolean x = true;
        boolean y = false;

        System.out.println("x & y : " +(x & y));
        System.out.println("x && y : " +(x && y));
        System.out.println("x | y : " +(x | y));
        System.out.println("x || y : " +(x || y));
        System.out.println("x ^ y : " +(x ^ y));
        System.out.println("!x : " +(!x));

    }

    public static void bitwiseOperatorsDemo() {
        header("Bitwise Operators");

        int x = 58; // 111010
        int y = 13; // 001101

        System.out.println("x & y : " + (x & y));   // returns 8 = 1000
        System.out.println("x | y : " + (x | y));   // 63 = 111111
        System.out.println("x ^ y : " + (x ^ y));   // 55 = 110111
        System.out.println("~x : " + (~x));          //-59
        System.out.println("x << y : " + (x << y));
        System.out.println("x >> y : " + (x >> y));
    }

    public static void ternaryOperatorDemo() {
        header("Ternary Operators");

        int age = 18;
        String result = age < 100 ?
                "Less than 100" : "Greater than 100";

        System.out.println(result);         // Less than 100
    }

    public static void unaryOperatorDemo() {
        header("Unary Operators");

        int sum =  +1;
        // Sum is now 1
        System.out.println(sum);

        sum--;
        // Sum is now 0
        System.out.println(sum);

        sum++;
        // Sum is now 1
        System.out.println(sum);

        sum = -sum;
        // Sum is now -1
        System.out.println(sum);

        boolean result = false;
        System.out.println(result);     // false
        System.out.println(!result);    // true

    }
    public static void header(String title) {
        System.out.println("\n------------------------------------");
        System.out.println(title);
        System.out.println("------------------------------------");
    }
}
