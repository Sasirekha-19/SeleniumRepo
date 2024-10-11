package homeassignment.week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
		
		 int num[] = {1, 2, 3, 4, 10, 6, 8};
		 
		 List<Integer> miss = new ArrayList<Integer>();
		 
		 for(int i=0;i<num.length;i++)
		 {
			miss.add(num[i]);
		 }
		 Collections.sort(miss);
		 
		 //[1,2,3,4,6,8,10]
		 System.out.print("Missing elements in the list:");
		 
		 for(int i=0;i<miss.size()-1;i++)
		 {
			 if(miss.get(i)+1!=miss.get(i+1)) {
				 System.out.print((miss.get(i)+1) +" ");
			 }
		 }

	}

}
