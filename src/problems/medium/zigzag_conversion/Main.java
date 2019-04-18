package problems.medium.zigzag_conversion;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		String res = "";
				 res= new Main().convert("PAYPALISHIRING", 3);
				System.out.println(res);
				res = new Main().convert("PAYPALISHIRING", 4);
				System.out.println(res);
		res = new Main().convert("AB", 1);
		System.out.println(res);
	}

	public String convert(String s, int numRows) {

		if (numRows == 1) {
			return s;
		}

		Map<Integer, StringBuilder> wk = new HashMap<Integer, StringBuilder>();
		for (int i = 0; i < numRows; i++) {
			wk.put(i, new StringBuilder());
		}

		boolean reverse = true;
		int key = 0;
		for (int i = 0; i < s.length(); i++) {
			wk.get(key).append(s.charAt(i));
			if (key == numRows - 1 || key == 0) {
				reverse = !reverse;
			}
			if (reverse) {
				key--;
			} else {
				key++;
			}

		}

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			builder.append(wk.get(i));
		}

		return builder.toString();
	}

}