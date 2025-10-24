package practice;

public abstract class Vehicle {

	private int ID;
	private final String brand = "Volvo";

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	public String getBrand() {
		return brand;
	}
	
   public abstract void drive();

	

}
