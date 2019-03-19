// LeetCode #58

class Solution {
    public int lengthOfLastWord(String s) {
        
        s = s.trim();
		
		if(s.isEmpty())
			return 0;
		
		int lastIndex = s.length() - 1;
		
		for (int i = lastIndex; i >= 0; i--) {
			if(s.charAt(i) == ' ')
				return lastIndex - i;
		}
		
		return s.length();
    }
}
