// LeetCode #20

class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
		Stack<Character> charStack = new Stack<Character>();

		for (Character c : chars) {
			switch (c) {
			case '(':
				charStack.push(')');
				break;
			case '[':
				charStack.push(']');
				break;
			case '{':
				charStack.push('}');
				break;
			default:
				if (c == ' ')
					break;
				else {
					if (charStack.isEmpty() || c != charStack.peek())
						return false;
					charStack.pop();
				}
			}

		}

		return charStack.isEmpty();
    }
}
