package Test9;

public class Cargoplane extends Plane {
	
	public Cargoplane () {
		super();
	}
	
	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		super.setFuelSize(super.getFuelSize() - (distance * 5));
	}
	
//	public void flight(int distance) {
//		while (distance != 0) {
//			distance -= 10;
//			this.setFuelSize(this.getFuelSize() - 50);
//
//		}
//	
//	}
	
	

}
