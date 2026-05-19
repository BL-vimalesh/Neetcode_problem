package subsequence;

public class subsequence {
	public static void main(String[] args) { 
		String str = "node";
		String str2 = "naode";
		char[] ch = str.toCharArray();
		char[] ch2 = str2.toCharArray();
		int i=0,j=0;
		while(i < ch.length && j < ch2.length) {
			if(ch[i] == ch[j]) {
				i++;
			}
			j++;
		}
		if(i==ch.length) {
			System.out.println("matched");
		}else {
			System.out.println("not matched");
		}
}
}