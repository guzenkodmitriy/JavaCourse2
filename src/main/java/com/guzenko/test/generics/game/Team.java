package com.guzenko.test.generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addParticipant(T participant) {
        participants.add(participant);
        System.out.println("Added participant " + participant.getName() + " to team " + this.name);
    }

    public void playWith(Team<T> team) {
        String winnerName;
        Random rand = new Random();
        int i = rand.nextInt(2);

        if (i == 0) {
            winnerName = this.name;
        }
        else {
            winnerName = team.name;
        }
        System.out.println("Winner is " + winnerName);
    }
}
