package sba2.practice.q2;

import java.text.DecimalFormat;

public class Cricket implements Sport{
    // an array starts with position 0 - this is called 0 based

    private int[] playerIDs;

    Cricket() {
        playerIDs = new int[12]; // Allows it to be 1 based
        for ( int i = 1; i < playerIDs.length; i++) {
            playerIDs[i] = 1;
        }
        System.out.println("A new cricket team has been formed.");
    }

    public void calculateAvgAge(int[] age) {
        int sum = 0;
        for ( int a : age) {
            sum += a;
        }
        double avg = (double)sum / (double)age.length;
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
}

