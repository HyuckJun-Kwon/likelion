package work.com.workshop08;

public class L5 extends Car implements Temp {

	public L5() {
		super();
	}

	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}

	@Override
	public int getTempGage() {
		return this.getDistance() / 5;
	}

	@Override
	public void go(int distance) {
		this.setOilSize(this.getOilSize() - (distance / 8));
	}
	
	@Override
	public void setOil(int oilSize) {
		this.setOilSize(this.getOilSize() + oilSize);
	}
}
