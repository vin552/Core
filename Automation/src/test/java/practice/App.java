package practice;

public class App {
    public static void main(String[] args) {
		/*
		 * Computer computer1 = new Computer(); computer1.GPU = "NVIDIA";
		 * computer1.hardDisk = "WD"; computer1.setRAM(1024); computer1.motherBoard =
		 * "random name"; computer1.processor = "Intel";
		 * 
		 * String returnValue = computer1.showSpecs(); //
		 * System.out.println(returnValue);
		 * 
		 * int result=computer1.addition(3, 4, "Result is: ");
		 * System.out.println(result);
		 */
       Motorcycle motor = new Motorcycle();
       motor.setID(1);
       motor.drive();
       Car car = new Car();
       car.setID(2);
       car.drive();
       
       
    }
}