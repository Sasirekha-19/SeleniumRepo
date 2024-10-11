package homeassignment.week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		String[] com = {"HCL","Wipro","Aspire Systems","CTS"};
		
		List<String> comp = new ArrayList<String>();
		
		for(int i=0;i<com.length;i++) {
			comp.add(com[i]);
		}
		Collections.sort(comp);
		System.out.println(comp);
		
		for(int i=comp.size()-1;i>=0;i--) {
			if(i==0) {
				System.out.println(comp.get(i));
			}else {
				System.out.print(comp.get(i)+ ","+ " ");
			}

		}
		}

}
