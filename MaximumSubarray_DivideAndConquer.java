public class MaximumSubarray_DivideAndConquer {

	// https://www.geeksforgeeks.org/maximum-subarray-sum-using-divide-and-conquer-algorithm/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { -2, 4, 3, -1, 5, -6 };
		//int[] arr = {-2};
		int n = arr.length;
		System.out.println(maxSubArraySum(arr, 0, n - 1));

	}

	public static int maxSubArraySum(int[] arr, int l, int h) {
		// Base case: Only one element left in the array
		if (l == h)
			return arr[l];
		// Find the middle point
		int mid = (l + h) / 2;

		// Find the max of right , and left and then check midpoint
		return Math.max(Math.max(maxSubArraySum(arr, l, mid), maxSubArraySum(arr, mid + 1, h)),
				maxCrossingSum(arr, l, mid, h));

	}

	public static int maxCrossingSum(int[] arr, int l, int mid, int h) {

		// include elements on left of mid
		int sum = 0;
		int leftSum = Integer.MIN_VALUE;

		for (int i = mid; i >= l; i--) {
			sum = sum + arr[i];
			if (sum > leftSum)
				leftSum = sum;
		}

		// include elements on right of mid
		sum = 0;
		int rightSum = Integer.MIN_VALUE;

		for (int i = mid + 1; i <= h; i++) {
			sum = sum + arr[i];
			if (sum > rightSum)
				rightSum = sum;
		}

		return leftSum + rightSum;
	}

}
