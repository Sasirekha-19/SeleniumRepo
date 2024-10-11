package homeassignment.week3.day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
	
		String test = "changeme";
		
		char[] ch = test.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(i%2!=0) {
				char a = ch[i];
				char uppercase = Character.toUpperCase(a);
				System.out.print(uppercase); 
			}else {
				System.out.print(ch[i]);
			}
			}
		
		}
	}

