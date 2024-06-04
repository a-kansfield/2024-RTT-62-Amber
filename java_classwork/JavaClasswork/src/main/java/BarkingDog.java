public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));

    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (isBarking && (hourOfDay >= 0 && hourOfDay <= 23)) {
            return hourOfDay < 8 || hourOfDay > 22;
        } else {
            return false;
        }
    }
}
