// LeetCode #69

class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
		
		long start = 1;
		long end = x;
		
		while (start <= end){
			long mid = (start + end) / 2;
			long midSquare = mid * mid;
			
			if(midSquare == x) 
				return (int)mid;
			
			else if(midSquare > x)
				end = mid - 1;
				
			else
				start = mid + 1;
		}
		
		return (int)start - 1;
    }
}
