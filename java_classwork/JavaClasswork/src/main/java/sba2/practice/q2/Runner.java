package sba2.practice.q2;

public class Runner {
    public static void main(String[] args) {
        Cricket c = new Cricket();

        int[] ages = { 10, 20, 30, 44, 24};
        c.calculateAvgAge(ages);
        c.retirePlayer(3);
        c.retirePlayer(3);
        System.out.println("====================");
        Football f = new Football();
        f.calculateAvgAge(ages);
        f.retirePlayer(5);
        f.retirePlayer(5);
        f.playerTransfer(200, 2);
        f.playerTransfer(300,5);

    }
}
