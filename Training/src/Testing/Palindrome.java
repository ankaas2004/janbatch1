package Testing;

public class Palindrome {
	
 
	public void palindrome1(int number) {
		
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
           
        }

        // if original and the reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
           System.out.println(number + " palindrome number");
        }else
        
        System.out.println(number + " not a palindrome number");
    }


   public static void main(String[] args) {
	 Palindrome obj = new Palindrome();
	 obj.palindrome1(121);
	 obj.palindrome1(123);
   
   }
		
	

}
