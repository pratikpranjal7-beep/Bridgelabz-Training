package org.example;

class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String loc, double dist, int exp, int act) {
        super(id, loc, dist, exp, act);
    }

    public boolean isCritical() {
        return true;
    }

    public String getType() {
        return "Delivery";
    }

    public double calculatePenalty() {
        return isDelayed() ? (actualDuration - expectedDuration) * 2 : 0;
    }
}