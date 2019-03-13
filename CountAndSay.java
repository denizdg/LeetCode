// LeetCode #38

class Solution {
    public String countAndSay(int n) {
        String sequenceStr = "1"; // first string of the sequence

		for (int i = 2; i <= n; i++) {

			StringBuilder temp = new StringBuilder();
			char prev = sequenceStr.charAt(0); // first element of the sequence string will be the pointer holding previous character
			int count = 1; // this is the counter for the numbers (horizontally)

			for (int j = 1; j < sequenceStr.length(); j++) { // starts from 1 because prev hold the index 0

				char ch = sequenceStr.charAt(j);

				if (ch != prev) {
					temp.append(count);
					temp.append(prev);
					count = 1; // reset the counter for the next character
					prev = ch; // assign the current character as previous
				} 
				else
					count++;
			}

			// after the second for, last numbers are still missing
			temp.append(count);
			temp.append(prev);
			sequenceStr = temp.toString();

		}

		return sequenceStr;
    }
}
