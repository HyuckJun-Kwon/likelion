package work.com.workshop07.test06;

public class Cargoplane extends Plane {

	public Cargoplane() {
		super();
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	@Override
	public void flight(int distance) {
		this.setFuelSize(this.getFuelSize() - (distance * 5)); 
	}
	
	

}
