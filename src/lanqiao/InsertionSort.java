package lanqiao;

public class InsertionSort {

	public static void main(String[] args) {
		int[] disorder = { 9, 3, 26, 8, 36, 27, 9, 28, 13 };
		int[] order = new int[disorder.length];
		int count = 0;
		int flag;
		for (int i = 0; i < disorder.length; i++) {
			flag = -1;
			for (int j = 0; j < count; j++) {
				if (disorder[i] <= order[j]) {
					flag = j;
					break;
				}
			}
			if (flag == -1) {
				order[count++] = disorder[i];
				continue;
			}
			for (int j = count; j > flag; j--) {
				order[j] = order[j - 1];
			}
			order[flag] = disorder[i];
			count++;
		}
		for (int i = 0; i < order.length; i++) {
			System.out.print(order[i] + " ");
		}
	}

}
