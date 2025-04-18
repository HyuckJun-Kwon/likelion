package work.com.workshop11.Q1;

public class Truck extends Car {
	
	public Truck() {
		super();
	}
	
	public Truck(int maxWeight, double oilTankSize, double efficiency) {
        super(maxWeight, oilTankSize, efficiency);
    }
	
	@Override
    public double getEfficiency() {
        return super.getEfficiency() - (getCurWeight() / 5) * 0.2;
    }
	
	@Override
    public void moving(int distance) {
        double oilUsed = calcOil(distance);
        setRestOil(Math.max(0, getRestOil() - oilUsed));
    }

    private double calcOil(int distance) {
        return distance / getEfficiency();
    }

    public int getCost(int distance) {
        return (int) (calcOil(distance) * 3000);
    }

    @Override
    public String toString() {
        return super.toString() + " " + getEfficiency();
    }
}
