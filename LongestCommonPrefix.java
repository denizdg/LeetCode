// LeetCode #14

class Solution {
    public String longestCommonPrefix(String[] strs) {
		
		if(strs == null || strs.length == 0)
			return "";
		
		String min = findMin(strs); 
		
		return LCP(strs, min);

	}
	
	public String LCP(String[] arr, String prefix){
		
		for (int i = 0; i < arr.length; i++) {
			if(!arr[i].startsWith(prefix))
				return LCP(arr, prefix.substring(0, prefix.length() - 1));
		}
		
		return prefix;
	}
	
	
	public String findMin(String[] arr){
		
		String min = arr[0];
		
		for (String str : arr) {
			if(str.length() < min.length())
				min = str;
		}
		
		return min;
	}
}
