package Test10;

public class Company {
	public static void main(String[] args) {
		
		Employee[] emp = new Employee[2];
		emp[0] = new Secretary("Hilery", 1, "secretary", 800);
		emp[1] = new Sales("Clinten", 2, "sales", 1200);

//		System.out.println("name    department    salary");
		System.out.println("name\tdepartment\tsalary");
		System.out.println("----------------------------");
		
		for (int i = 0; i < emp.length; i++) {
			Employee e = emp[i];
			System.out.printf("%-10s %-10s %-10d\n", e.getName(), e.getDepartment(), e.getSalary());
		}
//		for (int i = 0; i < emp.length; i++) {
//			System.out.println(emp[i].toString());
//		}
//		
//		for (int i = 0; i < emp.length; i++) {
//			if (emp[i] instanceof Sales) {
//				((Sales)emp[i]).incentive(100);
//			} else if (emp[i] instanceof Secretary) {
//				((Secretary)emp[i]).incentive(100);
//			}
//		}
		
		System.out.println("인센티브 100 지급");
		for (Employee e : emp) {
			if (e instanceof Secretary) {
				((Secretary)e).incentive(100);
			} else if (e instanceof Sales) {
				((Sales)e).incentive(100);
			}
		}
		
		System.out.println("name    department    salary    tax");
		System.out.println("------------------------------------");
		
		for(int i = 0; i < emp.length; i++) {
			Employee e = emp[i];
			System.out.printf("%-10s %-10s %-10d %-10.1f\n", e.getName(), e.getDepartment(), e.getSalary(), e.tax());
		}
//		for (int i = 0; i < emp.length; i++) {
//			System.out.print(emp[i].toString());
//			System.out.println("    " + emp[i].tax());
//		}
	}
}
