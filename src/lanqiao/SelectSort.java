package lanqiao;

public class SelectSort {

	public static void main(String[] args) {
		int[] nums = { 9, 3, 26, 8, 36, 27, 9, 28, 13 };
		for (int i = 0; i < nums.length; i++) {
			int k=i;
			for (int j = i+1; j < nums.length; j++) {
				if(nums[k]>nums[j]){
					k=j;
				}
			}
			int temp=nums[k];
			nums[k]=nums[i];
			nums[i]=temp;
			
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
