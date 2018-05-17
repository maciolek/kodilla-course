package com.rps;

import java.util.Random;

public class ComputerPlayer implements Player {

    private String name = "Komputer";

    private Random random = new Random();

    public ActionType playerAction() {
        ActionType[] actionTypes = ActionType.values();
        int computerChoice = random.nextInt(actionTypes.length);
        return actionTypes[computerChoice];
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = "Computer";
    }
}
