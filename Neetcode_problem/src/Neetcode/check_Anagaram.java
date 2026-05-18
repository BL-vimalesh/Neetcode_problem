package Neetcode;

import java.util.Arrays;

public class check_Anagaram {

	public static void main(String[] args) {
		String str = "abc";
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		String str2 = "abc";
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch2);
		System.out.println(ch);
		System.out.println(ch2);
		if(Arrays.equals(ch, ch2)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
