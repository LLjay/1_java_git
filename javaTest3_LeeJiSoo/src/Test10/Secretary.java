package Test10;

//public class Secretary extends Employee {
public class Secretary extends Employee implements Bonus {

	public Secretary() {
		super();
	}
	
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void incentive(int pay) {
		super.setSalary(super.getSalary() + (int)(pay * 0.8));
	}

	@Override
	public double tax() {
		return super.getSalary() * 0.1;
	}
	
//	public double tax() {
//		return this.getSalary() * 0.1;
//		
//	}
//	
//	public void incentive(int pay) {
//		this.setSalary((int)(pay * 0.8 + this.getSalary()));
//		
//	}
	
//	@Override
//	public String toString() {
//		return this.getName() + "    " + this.getDepartment() + "    " + this.getSalary();
//
//	}
}
