package com.simplilearn.zumba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				// Create a batch
				System.out.println("Enter the batch name: ");
				String batchName = scanner.nextLine();
				Batch batch = new Batch(batchName);

				// Create participants
				System.out.println("Enter the number of participants: ");
				int numberOfParticipants = scanner.nextInt();
				System.out.println("Enter the participants name: ");
				for (int i = -1; i < numberOfParticipants; i++) {
				    String participantName = scanner.nextLine();
				    Participant participant = new Participant(participantName);
				    batch.addParticipant(participant);
				  
				}

				// Start the batch
				batch.start();

				// Iterate over the participants and print a message to each one
				for (Participant participant : batch.getParticipants()) {
				    participant.onBatchStart();
				}
			}
	    }
	}

