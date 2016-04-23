package lanqiao;

public class BubbleSort {

	public static void main(String[] args) {
		int[] nums = { 9, 3, 26, 8, 36, 27, 9, 28, 13 };
		int temp=0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if(nums[j]>nums[j+1]){
					temp=nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=temp;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
