package homeassignment.week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		
		int a[] = {3,2,11,4,6,7};
		int b[] = {1,2,8,4,9,7};
		
		List<Integer> num1 = new ArrayList<Integer>();
		List<Integer> num2 = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			num1.add(a[i]);
		}
		
		for(int j=0;j<b.length;j++) {
			num2.add(b[j]);
		}
		
		System.out.print("matching elements:");
		
		for(int i=0;i<num1.size();i++)
		{
			for(int j=0;j<num2.size();j++) {
				if(num1.get(i)== num2.get(j)) {
					System.out.print(num2.get(j)+ " ");
				}
			}
		}

	}

}
