// LeetCode #66

class Solution {
    public int[] plusOne(int[] digits) {
        int[] plusOne = new int[digits.length + 1];

		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] != 9) {
				digits[i]++;
				return digits;
			} 
			else {
				if (i != 0) {
					digits[i] = 0;
					continue;
				} 
				else {
					digits[i] = 0; // i = 0
					plusOne[0] = 1;
				}
			}
		}

		return plusOne;

    }
}
