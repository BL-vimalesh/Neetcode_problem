package subsequence;

public class sequence {
	public static void main(String[] args) { 
		String str = "axc";
		String str2 = "ahbgdc";
		char[] ch = str.toCharArray();
		char[] ch2 = str2.toCharArray();
		int m = 0;
		
		boolean match = true; 

		for(int i = 0; i < ch.length; i++) {
		
			boolean current = false; 

			for(int j = m; j < ch2.length; j++) {
				if(ch[i] == ch2[j]) {
					m = j + 1;
					current = true; 
					break;
				}
			}

			if (!current) {
				match = false;
				break;
			}
		}

		
			System.out.println(match); 
		}
	}