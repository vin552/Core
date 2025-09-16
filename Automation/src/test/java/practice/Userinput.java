package practice;

import java.util.Scanner;

public class Userinput {
	
	public static void main(String[] args) {
		
		System.out.println("Type an integer and press enter to continue: ");
		
		Scanner scanner = new Scanner(System.in);
 
		Integer input = scanner.nextInt();
		System.out.println(input);
		
	}

}

