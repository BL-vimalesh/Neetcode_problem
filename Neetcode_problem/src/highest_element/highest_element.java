package highest_element;

import java.util.Arrays;

public class highest_element {

	public static void main(String[] args) {
		int[] arr = {2,3,5,4,3,1};
		int max = 0;
		int[] newarr = new int[arr.length];
		for(int i=0;i<arr.length-1;i++){
			max = arr[i+1];//max = 3
			for(int j=i+2;j<arr.length;j++) {
				System.out.println(arr[j]);
				if(max < arr[j]) {//max = 3 < 5, max = 5
					max = arr[j];
				}}
				newarr[i] = max;
			}
		newarr[arr.length - 1] = -1;
		for(int i=0;i<newarr.length;i++) {
			System.out.print(newarr[i]);
		}
		System.out.println(Arrays.toString(newarr));
		}
	}

