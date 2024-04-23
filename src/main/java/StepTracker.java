import java.util.ArrayList;
public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int totalDays;
    private int activeDaysCount;

    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
        totalSteps = 0;
        totalDays = 0;
        activeDaysCount = 0;
    }

    public void addDailySteps(int steps) {
        totalSteps += steps;
        totalDays++;
        if (steps >= minSteps) {
            activeDaysCount++;
        }
    }

    public int activeDays() {
        return activeDaysCount;
    }

    public double averageSteps() {
        if (totalDays == 0) {
            return 0;
        }
        return (double) totalSteps / totalDays;
    }
}
