package Arrays;

class merge_two_sorted_arrays {

	public static int[] mergeTwoSortedArrays(int arr1[], int arr2[], int m, int n) {
		int[] ans = new int[m + n];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < arr1.length) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 6, 9 };
		int[] arr2 = { 3, 4, 6, 9, 10 };
		int[] ans = mergeTwoSortedArrays(arr1, arr2, arr1.length, arr2.length);
		for (int elem : ans) {
			System.out.print(elem + " ");
		}
	}
}
