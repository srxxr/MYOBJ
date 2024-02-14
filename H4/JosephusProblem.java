package H4;

import java.util.LinkedList;
import java.util.Queue;

public class JosephusProblem {
    public static int josephusProblem(int numParticipants, int eliminationStep) {
        Queue<Integer> participants = new LinkedList<>();

        // Add participants to the queue
        for (int i = 1; i <= numParticipants; i++) {
            participants.add(i);
        }

        while (participants.size() > 1) {
            // Perform the elimination process
            for (int i = 0; i < eliminationStep - 1; i++) {
                // Move the front participant to the rear
                participants.add(participants.remove());
            }

            // Remove the participant at the front of the queue (eliminated)
            participants.remove();
        }

        // Return the last remaining participant
        return participants.peek();
    }

    public static void main(String[] args) {
        int numParticipants = 7;
        int eliminationStep = 3;

        int winner = josephusProblem(numParticipants, eliminationStep);
        System.out.println("Winner: Participant " + winner);
    }
}
