
public class Printuniquechars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "GeeksforGeeks";
		
		for(int i=0;i<str.length();i++ ) {
			
		
		int flag=0;
		
		for (int j=0;j<str.length();j++) {
			
			if(str.charAt(i)==str.charAt(j) && i!=j)
			{
				
				flag=1;
				break;
				
			}
		}
		if(flag==0)
		System.out.println(str.charAt(i));
		
		}
		
	}

}