package work.com.workshop07.Q6;

public class Airplane extends Plane {

	public Airplane() {
		super();
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		this.setFuelSize(this.getFuelSize() - (distance*3));
	}

}
