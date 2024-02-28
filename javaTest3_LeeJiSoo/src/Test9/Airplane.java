package Test9;

public class Airplane extends Plane {
	
	public Airplane () {
		super();
	}
	
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		super.setFuelSize(super.getFuelSize() - (distance * 3));
	}
	
//	public void flight(int distance) {
//		while (distance != 0) {
//			distance -= 10;
//			this.setFuelSize(this.getFuelSize() - 30);
//		}
//		
//	}
	
	
	

}
