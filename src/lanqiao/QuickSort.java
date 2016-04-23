package lanqiao;

public class QuickSort {

	public static void main(String[] args) {
		int[] nums = { 9, 3, 26, 8, 36, 27, 9, 28, 13 };	
		sort(nums, 0, 8);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

	static void sort(int[] nums,int begin,int end){
		if(begin>=end)
			return;
		int index=sortUnit(nums, begin, end);
		sort(nums, begin, index-1);
		sort(nums, index+1, end);
	}
	
	static int sortUnit(int[] nums, int begin, int end) {
		int key = nums[begin];
		while (begin < end) {
			while(begin<end&&nums[end]>=key){
				end--;
			}
			nums[begin]=nums[end];
			while (begin<end&&nums[begin]<=key) {
				begin++;
			}
			nums[end]=nums[begin];
		}
		nums[end]=key;
		return end;
	}

}
