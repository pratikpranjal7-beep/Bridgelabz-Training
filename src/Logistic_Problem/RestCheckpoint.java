package Logistic_Problem;

public class RestCheckpoint extends Checkpoint{
    public RestCheckpoint(String checkpointId, String locationName, double distanceFromLast,
                          int expectedDuration, int actualDuration) {
        super(checkpointId, locationName, distanceFromLast, expectedDuration, actualDuration);
    }

    @Override
    public boolean isCritical() {
        return false;
    }

    @Override
    public String getType() {
        return "RestCheckpoint";
    }

    @Override
    public double calculatePenalty() {
        int delay = actualDuration - expectedDuration;
        if (delay > 30) {
            return delay * 0.5;
        }
        return 0.0;
    }
}
