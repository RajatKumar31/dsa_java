package Arrays;

public class buy_sell_stocks {

	public static int maxProfit(int[] arr) {
		int maxPro = 0, minPrice = Integer.MAX_VALUE;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] < minPrice) {
				minPrice = arr[i];
			} else {
				maxPro = Math.max(arr[i] - minPrice, maxPro);
			}
			i++;
		}
		return maxPro;
	}

	public static void main(String[] args) {
		int[] arr = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(arr));
	}
}
