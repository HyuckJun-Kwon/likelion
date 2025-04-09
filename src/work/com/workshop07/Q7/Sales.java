package work.com.workshop07.Q7;

public class Sales extends Employee implements Bonus {
	
	public Sales() {
		super();
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void incentive(int pay) {
		this.setSalary(this.getSalary()+ ((pay*120)/100));
	}

	@Override
	public double tax() {
		return this.getSalary() * 0.13;
	}

}
