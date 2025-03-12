package work.com.workshop08;

public class L3 extends Car implements Temp {

	public L3() {
		super();
	}

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}

	@Override
	public int getTempGage() {
		return this.getDistance() / 10;
	}

	@Override
	public void go(int distance) {
		this.setOilSize(this.getOilSize() - (distance / 10));
	}
	
	@Override
	public void setOil(int oilSize) {
		this.setOilSize(this.getOilSize() + oilSize);
	}

}
