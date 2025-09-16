
public class Lowesteven {

	
		 public static void main(String[] args) {
				// TODO Auto-generated method stub
				
			
				
				        int lowestEven = Integer.MAX_VALUE; // start with a very large number

				        for (int i = 1; i <= 100; i++) {
				            if (i % 2 == 0) {  // check even
				                if (i < lowestEven) {  // compare
				                    lowestEven = i;
				                }
				            }
				        }

				        if (lowestEven == Integer.MAX_VALUE) {
				            System.out.println("No even numbers found.");
				        } else {
				            System.out.println("Lowest even number = " + lowestEven);
				        }
				    }	
	}
