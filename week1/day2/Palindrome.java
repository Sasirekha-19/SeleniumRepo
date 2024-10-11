package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int input,output = 0,rem;
		
		input = 121;
		
		for (int i=121;i>0;i=i/10) {
			
	        rem = i%10;
	        
	        output = (output*10)+rem;  // loop 1: i=121, rem=1, output = (0*10)+1 =1;
	        // loop 2: i=12, rem = 2, output = (1*10)+2 = 12;
	        //loop 3: i=1, rem = 1, output = (12*10)+1 = 121;
	        
		}
	        if(input==output)
	        {
			System.out.println("Given number is a palindrome number");
	        }
		else
		{
			System.out.println("Given number is not a palindrome number");
		}
		
		 }
	}  
	        

   

 
	