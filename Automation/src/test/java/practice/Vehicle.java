package practice;

public abstract class Vehicle {

	private int ID;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
    public abstract void drive();

}
