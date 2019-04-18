package problems.easy.valid_parentheses;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		String[] wk = new String[] { "()", "()", "(]", "([)]", "{[]}", "){" };
		for (int i = 0; i < wk.length; i++) {
			boolean res = new Main().isValid(wk[i]);
			System.out.println(res);
		}

	}

	public boolean isValid(String s) {
		Map<Character, Character> mappings = new HashMap<Character, Character>();
		mappings.put(')', '(');
		mappings.put('}', '{');
		mappings.put(']', '[');

		if (s == null || s.length() % 2 != 0) {
			return false;
		}

		LinkedList<Character> wk = new LinkedList<Character>();
		for (int i = 0; i < s.length(); i++) {
			char pick = s.charAt(i);
			if (mappings.containsKey(pick)) {
				char res = wk.isEmpty() ? '@' : wk.pop();
				if (mappings.get(pick) != res) {
					return false;
				}
			} else {
				wk.push(pick);
			}
		}

		return wk.size() == 0;
	}

	public boolean isValidOrign(String s) {
		if (s == null || s.length() % 2 != 0) {
			return false;
		}

		LinkedList<Character> wk = new LinkedList<Character>();
		for (int i = 0; i < s.length(); i++) {
			char tmp = s.charAt(i);
			switch (tmp) {
			case '(':
			case '{':
			case '[':
				wk.push(tmp);
				break;
			case ')':
			case '}':
			case ']':
				if (wk.size() == 0) {
					return false;
				}
				char rTmp = wk.getFirst();
				if (rTmp == '(' && tmp == ')') {
					wk.pop();
				} else if (rTmp == '{' && tmp == '}') {
					wk.pop();
				} else if (rTmp == '[' && tmp == ']') {
					wk.pop();
				} else {
					wk.push(tmp);
				}
				break;
			}
		}

		return wk.size() == 0;
	}

}