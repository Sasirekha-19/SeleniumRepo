package homeassignment.week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int num[] = {3, 2, 11, 4, 6, 7};
		
		List<Integer> sec = new ArrayList<Integer>();
		
		for(int i=0;i<num.length;i++) {
			sec.add(num[i]);
			}
		Collections.sort(sec);
		
		System.out.println(sec);
		
		//[2,3,4,6,7,11]
		System.out.println("Second largest element in the list:"+ sec.get(sec.size()-2));
	//or
		//for(int i=sec.size()-1;i>=0;i--) {
		//if(i==4) {
			//System.out.println(sec.get(i));
			//break;
		//}
	//}
	}

}
