package problems.easy.excel_sheet_column_title;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String res = "";
		res = new Main().convertToTitle(1);//A
		System.out.println(res);
		res = new Main().convertToTitle(26);//Z
		System.out.println(res);
		//		res = new Main().convertToTitle(28);//AB
		//		System.out.println(res);
		//		res = new Main().convertToTitle(701);//ZY
		//		System.out.println(res);
	}

	public String convertToTitle(int n) {

		if (n == 1) {
			return "A";
		}
		StringBuilder builder = new StringBuilder();
		while (n > 0) {
			int base = n - 1;
			int amari = base % 26;
			builder.append((char) (amari + 'A'));
			n = base / 26;
		}
		return builder.reverse().toString();
	}

}