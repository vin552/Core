
public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        String s = "Welcome to java class";

        String res = "";

        for (int i = s.length() - 1; i >= 0; i--) {

                       char c = s.charAt(i);

                       res = res + c;

        }

        System.out.println("Reverse of string: " + res);

        if (s.equals(res)) {

                       System.out.println("String is paindrome");

        } else {

                       System.out.println("Not palindrome");

        }

}

}