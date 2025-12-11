
public class Smallestandlargestint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {10,5,6,1,23,9};
		
		int smallest = arr[0];//4
		 int largest = arr[0];//4
		
for(int i=1;i<arr.length;i++) {
	
	if (arr[i]>largest) {
		
		
		largest = arr[i];
	}
		else
			if(arr[i]<smallest) {  
			
			
			smallest =arr[i];
		
	}
}

System.out.println(smallest +","+ largest);
	}

}
