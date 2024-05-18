package slides._303_14;

public class FunctionalKBA {
    public static void main(String[] args) {
        MyFunctionalInterfaceKBA fi = n -> {
            return n+n;
        };

        System.out.println(fi.sqr(5));
    }

}
