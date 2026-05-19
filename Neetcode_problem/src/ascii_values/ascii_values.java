package ascii_values;

public class ascii_values {
	public static void main(String[] args) {
	     String str ="neetcode";
	     char[] ch = str.toCharArray();
	     int length = 0;
	     int newlength = 0;
	     for(int i=0;i<ch.length-1;i++) {//c=99,a=97,t=116
	    	 length =0;
	    		 length =Math.abs(ch[i+1] - ch[i]);
	    		 newlength = newlength + length;
	    		 
	     }
	    	 System.out.println(newlength);
	}
//	     System.out.println(length);
}
