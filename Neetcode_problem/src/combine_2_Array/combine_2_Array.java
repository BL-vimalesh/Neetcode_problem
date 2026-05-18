package combine_2_Array;

public class combine_2_Array {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int[] arr = new int[nums.length*2];
		for(int i=0;i<nums.length;i++) {
			arr[i] = nums[i];
			arr[nums.length+i] = nums[i];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
