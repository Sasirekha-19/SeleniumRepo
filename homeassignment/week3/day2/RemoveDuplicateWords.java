package homeassignment.week3.day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1"; 
		
		//int count = 0;
		
		String[] splitword = text.split(" ");
		System.out.println(splitword);
		
		for(int i=0;i<splitword.length;i++)
		{
			if(splitword[i].equals("java")) {
				String text1 = splitword[i].replaceAll(splitword[i]," ");
				System.out.print(text1 + " ");
			}
			else {
			System.out.print(splitword[i] + " ");
			}
			
		}
	}
	
	}

			//for(int j=i+1;j<splitword.length;j++)
			///{
				//if(splitword[i].equalsIgnoreCase(splitword[j])) {
					//count++;
				//}
			
				//if(count>1){
				//	String replace = splitword[j].replaceAll(splitword[j]," ");
				//	System.out.println(replace);
				//}
			//}
			//System.out.println(splitword[i]);

				

	



