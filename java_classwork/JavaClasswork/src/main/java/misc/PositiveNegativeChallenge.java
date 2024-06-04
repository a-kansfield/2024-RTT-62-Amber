package misc;

public class PositiveNegativeChallenge {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(25);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megabytes = kiloBytes / 1024;
            int remainKilobytes = kiloBytes % 1024;
            System.out.println(" KB = " + megabytes + " MB and " + remainKilobytes + " KB");
        }
    }

}
