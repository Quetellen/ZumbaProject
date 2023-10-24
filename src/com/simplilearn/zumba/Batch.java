package com.simplilearn.zumba;


import java.util.ArrayList;
import java.util.List;

public class Batch {

		private String name;

		private List<Participant> participants;

		public Batch(String name) {
			this.name = name;
			this.participants = new ArrayList<>();
		}

		public void addParticipant(Participant participant) {
			this.participants.add(participant);
		}

	    public void start() {
	        System.out.println("The " + name + " batch has started!");
	        for (Participant participant : this.participants) {
	            participant.onBatchStart();
	        }
	    }

	    public List<Participant> getParticipants() {
	        return this.participants;
	    }

}