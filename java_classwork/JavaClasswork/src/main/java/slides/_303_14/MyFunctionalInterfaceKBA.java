package slides._303_14;

@FunctionalInterface
public interface MyFunctionalInterfaceKBA {
    public Integer sqr(int a);
    default String sqr(String a) {
        return a + a;
    }
}
