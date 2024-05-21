package sba2.practice.q2;

import java.text.DecimalFormat;

public class Football {
    private int[] playerIDs;

    Football() {
        playerIDs = new int[12]; // Allows it to be 1 based
        for ( int i = 1; i < playerIDs.length; i++) {
            playerIDs[i] = 1;
        }
        System.out.println("A new football team has been formed.");
    }

    public void calculateAvgAge(int[] age) {
        double sum = 0;
        for ( int a : age) {
            sum += a;
        }
        double avg = sum / age.length;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("The average age of the team is " + df.format(avg));
    }

    public void retirePlayer(int id){
        if (playerIDs[id] == -1) {
            System.out.println("Player has already retired.");
        } else {
            playerIDs[id] = -1;
            System.out.println("PLayer with id: " + id + " has retired");
        }
    }

    public void playerTransfer(int fee, int id) {
        if (playerIDs[id] == -1) {
            System.out.println("Player has already retired.");
        } else {
            System.out.println("PLayer with id: " + id + " has been transferred with a fee of " + fee);
        }
    }
}
