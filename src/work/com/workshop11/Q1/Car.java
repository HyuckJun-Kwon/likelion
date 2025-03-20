package work.com.workshop11.Q1;

public class Car extends Vehicle {
    private double restOil;
    private int curWeight;

    public Car(int maxWeight, double oilTankSize, double efficiency) {
        super(maxWeight, oilTankSize, efficiency);
        this.restOil = 0;
        this.curWeight = 0;
    }

    public double getRestOil() { return restOil; }
    public int getCurWeight() { return curWeight; }

    public void setRestOil(double restOil) { this.restOil = restOil; }
    public void setCurWeight(int curWeight) { this.curWeight = curWeight; }

    public void addOil(int oil) {
        this.restOil = Math.min(this.restOil + oil, getOilTankSize());
    }

    public void moving(int distance) {
        double oilUsed = distance / getEfficiency();
        this.restOil = Math.max(0, this.restOil - oilUsed);
    }

    public void addWeight(int weight) {
        if (this.curWeight + weight <= getMaxWeight()) {
            this.curWeight += weight;
        }
    }

    public String toString() {
        return super.toString() + " " + restOil + " " + curWeight;
    }
}
