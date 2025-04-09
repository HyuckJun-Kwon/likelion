package work.com.workshop07.Q7;

public class Company {

	public static void main(String[] args) {
		Employee e1 = new Secretary("Hilery", 1, "secretary", 800);
		Employee e2 = new Sales("Clinten", 2, "sales", 1200);
		Employee[] employees = {e1, e2};
		
		printEmployees(employees, false);

        System.out.println("\n인센티브 100 지급\n");
        for (Employee e : employees) {
            if (e instanceof Secretary) {
                ((Secretary) e).incentive(100);
            } else if (e instanceof Sales) {
                ((Sales) e).incentive(100);
            }
        }

        printEmployees(employees, true);
    }

    private static void printEmployees(Employee[] employees, boolean includeTax) {
        if (includeTax) {
            System.out.println("name     department     salary     tax");
            System.out.println("-----------------------------------------");
            for (Employee e : employees) {
                System.out.printf("%s     %s     %d     %.1f\n",
                    e.getName(), e.getDepartment(), e.getSalary(), e.tax());
            }
        } else {
            System.out.println("name     department     salary");
            System.out.println("---------------------------------");
            for (Employee e : employees) {
                System.out.printf("%s     %s     %d\n", e.getName(), e.getDepartment(), e.getSalary());
            }
        }
    }
}
