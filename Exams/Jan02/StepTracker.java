package Exams.Jan02;

public class StepTracker {
    private int calories;
    private int activedays;

    public StepTracker(int calories, int activedays) {
        this.calories = calories;
        this.activedays = activedays;
    }

    public void addDailySteps(int steps) {
        this.calories += steps;
        activedays++;
    }

    public int activeDays() {
        return activedays;
    }

    public double averageSteps() {
        return (double) calories / activedays;
    }
}
