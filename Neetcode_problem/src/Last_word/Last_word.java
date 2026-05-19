package Last_word;

public class Last_word {

	public static void main(String[] args) {
String str = "   fly me   to   the moon  ";
        String[] words = str.split(" ");
        String str2 = words[words.length-1];
        System.out.println(str2.length());
	}

}
