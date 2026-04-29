package org.example;

class FuelCheckpoint extends Checkpoint {

    public FuelCheckpoint(String id, String loc, double dist, int exp, int act) {
        super(id, loc, dist, exp, act);
    }

    public boolean isCritical() {
        return true;
    }

    public String getType() {
        return "Fuel";
    }

    public double calculatePenalty() {
        return isDelayed() ? 10 : 0;
    }
}
