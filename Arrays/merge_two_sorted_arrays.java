package Arrays;

class merge_two_sorted_arrays {

	// You may have to assume that ‘ARR1’ has a size equal to ‘M’ + ‘N’ such that
	// ‘ARR1’ has enough space to add all the elements of ‘ARR2’ in ‘ARR1’.
	// For example:
	// ‘ARR1’ = [3 6 9 0 0]
	// ‘ARR2’ = [4 10]
	// After merging the ‘ARR1’ and ‘ARR2’ in ‘ARR1’.
	// ‘ARR1’ = [3 4 6 9 10]
	public static int[] mergeTwoSortedArrays_2(int arr1[], int arr2[], int m, int n) {
		int i = m - 1, j = n - 1, k = m + n - 1;
		while (i >= 0 && j >= 0) {
			if (arr1[i] >= arr2[j]) {
				arr1[k] = arr1[i];
				i--;
				k--;
			} else {
				arr1[k] = arr2[j];
				j--;
				k--;
			}
		}
		while (i >= 0) {
			arr1[k] = arr1[i];
			i--;
			k--;
		}
		while (j >= 0) {
			arr1[k] = arr2[j];
			j--;
			k--;
		}
		return arr1;
	}

	// creating new array of size arr1.length + arr2.length and returning it.
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
