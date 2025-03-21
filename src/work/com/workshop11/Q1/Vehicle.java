package work.com.workshop11.Q1;

public class Vehicle {
	
    private int maxWeight;
    private double oilTankSize;
    private double efficiency;

    public Vehicle() {
    	super();
    }

    public Vehicle(int maxWeight, double oilTankSize, double efficiency) {
        this.maxWeight = maxWeight;
        this.oilTankSize = oilTankSize;
        this.efficiency = efficiency;
    }

    public int getMaxWeight() { 
    	return maxWeight;
    }
    
    public double getOilTankSize() { 
    	return oilTankSize;
    }
    
    public double getEfficiency() { 
    	return efficiency;
    }

    public void setMaxWeight(int maxWeight) {
    	this.maxWeight = maxWeight;
    }
    
    public void setOilTankSize(double oilTankSize) { 
    	this.oilTankSize = oilTankSize;
    }
    
    public void setEfficiency(double efficiency) {
    	this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return maxWeight + " " + oilTankSize;
    }
}