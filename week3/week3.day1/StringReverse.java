package week3.day1

public class StringReverse {

	public static void main(String[] args) {
		
		String name = "sasirekha";
		
		char[] ch = name.toCharArray();
		
		System.out.println(ch.length);
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}

	}

}
