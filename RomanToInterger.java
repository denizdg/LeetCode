class Solution {
    public int romanToInt(String s) {

		char prev = '0';
		int result = 0;

		for (int i = 0; i <= s.length() - 1; i++) {

			if (i == 0) {
				result += convert(s.charAt(i));
				prev = s.charAt(i);
			} else {

				if (checkPrev(s.charAt(i), prev)) {
					result = result + convert(s.charAt(i)) - (2 * convert(prev));
					prev = s.charAt(i);
				} else {
					result += convert(s.charAt(i));
					prev = s.charAt(i);
				}

			}
		}

		return result;

	}

	public int convert(char letter) {

		int value = 0;
		switch (letter) {
		case 'M':
			value = 1000;
			break;
		case 'D':
			value = 500;
			break;
		case 'C':
			value = 100;
			break;
		case 'L':
			value = 50;
			break;
		case 'X':
			value = 10;
			break;
		case 'V':
			value = 5;
			break;
		case 'I':
			value = 1;
			break;

		}
		return value;

	}

	public boolean checkPrev(char letter, char prev) {

		if (prev == 'C' && (letter == 'M' || letter == 'D'))
			return true;
		else if (prev == 'X' && (letter == 'C' || letter == 'L'))
			return true;
		else if (prev == 'I' && (letter == 'V' || letter == 'X'))
			return true;
		else
			return false;
	}
}
