class Solution {
    public boolean isPalindrome(int x) {
        
       int temp = x;
		int reverse = 0;

		if (x < 0) {
			return false;
		} else {
			while (temp != 0) {

				reverse = reverse * 10 + temp % 10;
				temp = temp / 10;
			}

			return reverse == x ? true : false;
		}
   }
}
