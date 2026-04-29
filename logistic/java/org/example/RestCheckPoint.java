package org.example;

class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String loc, double dist, int exp, int act) {
        super(id, loc, dist, exp, act);
    }

    public boolean isCritical() {
        return false;
    }

    public String getType() {
        return "Rest";
    }

    public double calculatePenalty() {
        int delay = actualDuration - expectedDuration;
        return (delay > 30) ? delay * 0.5 : 0;
    }
}
