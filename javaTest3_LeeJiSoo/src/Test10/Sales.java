package Test10;

//public class Sales extends Employee 
public class Sales extends Employee implements Bonus {
	public Sales() {
		
	}
	
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void incentive(int pay) {
		super.setSalary(super.getSalary() + (int)(pay * 1.2));
	}

	@Override
	public double tax() {
		return (super.getSalary() * 0.13);
	}
	
//	public double tax() {
//		return this.getSalary() * 0.13;
//	}
//	
//	public void incentive(int pay) {
//		this.setSalary((int)(pay * 1.2 + this.getSalary()));
//	}

//	@Override
//	public String toString() {
//		return this.getName() + "    " + this.getDepartment() + "    " + this.getSalary();
//
//	}
}
