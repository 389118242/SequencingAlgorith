package lanqiao;

public class ShellSort {

	public static void main(String[] args) {
		int[] nums = { 9, 3, 26, 8, 36, 27, 9, 28, 13 };
		int d=nums.length;
		boolean isRun;
		for (int i =d/2; i >0;) {
			isRun=false;
			for (int j= 0; j+i < nums.length; j++) {
				if(nums[j]>nums[j+i]){
					int temp=nums[j];
					nums[j]=nums[j+i];
					nums[j+i]=temp;
					isRun=true;
				}
			}
			if(i==1&&isRun){
				continue;
			}
			i/=2;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}

	}
	
	static void shellSortFromBaidu(int[] a){
		int d=a.length;
		while(true)
        {
            d=d/2;
            for(int x=0;x<d;x++)
            {
                for(int i=x+d;i<a.length;i=i+d)
                {
                    int temp=a[i];
                    int j;
                    for(j=i-d;j>=0&&a[j]>temp;j=j-d)
                    {
                        a[j+d]=a[j];
                    }
                    a[j+d]=temp;
                }
            }
            if(d==1)
            {
                break;
            }
        }
	}

}
