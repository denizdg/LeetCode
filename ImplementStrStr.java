// LeetCode #28

// Knuth-Morris-Pratt (KMP) algorithm
// Check for Algorithm :
// https://www.youtube.com/watch?v=V5-7GzOfADQ 
// https://www.youtube.com/watch?v=GTJr8OvyEVQ 

class Solution {
    public int strStr(String haystack, String needle) {

		if (needle.isEmpty())
			return 0;

		Integer[] prefixTable = preparePrefixTable(needle);

		int i = 0;
		int j = 0;

		while (i < haystack.length() && j < needle.length()) {
			if (haystack.charAt(i) == needle.charAt(j)) {
				i++;
				j++;
			} else if (j != 0)
				j = prefixTable[j - 1];
			else
				i++;
		}

		return j == needle.length() ? i - j : -1;

	}

	public Integer[] preparePrefixTable(String needle) {

		Integer[] prefixTable = new Integer[needle.length()];

		int i = 0;
		int j = 1;

		prefixTable[0] = 0;

		while (j < needle.length()) {

			if (needle.charAt(i) == needle.charAt(j)) {
				prefixTable[j] = i + 1;
				i++;
				j++;
			}
      // sayilar esit degilse ve i sifir degilde, i, bir onceki indeksin
			// valuesuna atanir.
			else if (i != 0) {
				i = prefixTable[i - 1];
			} else {
				prefixTable[j] = 0;
				j++;
			}

		}

		return prefixTable;

	}

}
