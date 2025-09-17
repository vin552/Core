package practice;

import java.util.Scanner;

public class Switchcondition {
	
	
	public static void main(String[] args) {
		
		
		System.out.println("please specify number between 1 to 8");
		Scanner userInput = new Scanner(System.in);
		int dayOfWeek = userInput.nextInt();
		
		switch(dayOfWeek) {
		
		case 1:
			
			System.out.println("Mon");
			break;
			case 2:
				
				System.out.println("Tue");
				break;

			case 3:
				
				System.out.println("Wed");
				break;

				
				case 4:
					
					System.out.println("Thu");
					break;

				case 5:
					
					System.out.println("Fri");
					break;

					
					case 6:
						
						System.out.println("Sat");
						break;

					case 7:
						
						System.out.println("Sun");
						break;

						
						default:
							System.out.println("Incorrect value entered");
						
					
	}
	
		
		
	}

}
