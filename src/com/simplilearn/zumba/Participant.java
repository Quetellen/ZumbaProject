package com.simplilearn.zumba;

public class Participant {

	private String name;

    public Participant(String name) {
        this.name = name;
    }

    public void onBatchStart() {
       System.out.println(this.name);
    }
}