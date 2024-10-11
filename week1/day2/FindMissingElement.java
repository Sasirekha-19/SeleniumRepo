package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int a[] = {1,4,3,2,8,6,7};
		
		Arrays.sort(a);
		
		//{1,2,3,4,6,7,8}
		for (int i=1;i<a.length;i++) // or for(int i=0;i<a.length;i++)
	{
			int b=a[i]-1;
			
			if(i!=b)
			 {
				 System.out.println("missing element in array:" +b);
				 break;
			 }
				
				
		}
	}

}

