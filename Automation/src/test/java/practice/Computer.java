package practice;

public class Computer {
    private int RAM;
    private String GPU;
    private String hardDisk;
    private String motherBoard;
    private String processor;
    
    public Computer() {
    	
    	System.out.println("Constructor is called");
    }
    
    public Computer(String processorName) {
    	
    	processor = processorName;
    }
    
    public int getRam() {
    	
    	return this.getRAM();
    }

    void showInfo() {
        System.out.println("This computer has: " + getRAM() + " this amount of RAM, and has the following processor: " + processor);
    }

    String showSpecs() {
        return "This computer has: " + getRAM() + " this amount of RAM, and has the following processor: " + processor;
    }

    int addition(int firstNumber, int secondNumber, String resultString) {
        int result = firstNumber + secondNumber;
        System.out.println(resultString + result);
        return result;
    }

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}
}