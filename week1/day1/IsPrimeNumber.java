package week1.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		int n=13;
		boolean var  = false;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println(" Given Number is not a Prime number");
				var = true;
				break;
			}
		}
				if(var == false) {
					System.out.println("Given Number is a Prime number");
					
	}

}
}
