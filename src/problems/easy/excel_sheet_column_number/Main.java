package problems.easy.excel_sheet_column_number;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int res = 0;
		res = new Main().titleToNumber("A");//1
		System.out.println(res);

		res = new Main().titleToNumber("AB");//28
		System.out.println(res);

		res = new Main().titleToNumber("ZY");//701
		System.out.println(res);
	}

	public int titleToNumber(String s) {
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			int num = (int) s.charAt(i) - (int) 'A' + 1;
			res *= 26;
			res += num;
		}
		return res;
	}

}