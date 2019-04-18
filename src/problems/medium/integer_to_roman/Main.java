package problems.medium.integer_to_roman;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String res = "";
		res = new Main().intToRoman(3);
		System.out.println(res);
		res = new Main().intToRoman(4);
		System.out.println(res);
		res = new Main().intToRoman(9);
		System.out.println(res);
		res = new Main().intToRoman(99);
		System.out.println(res);
		res = new Main().intToRoman(1994);
		System.out.println(res);
		res = new Main().intToRoman(3999);
		System.out.println(res);
	}

	public String intToRoman(int num) {

		String rangeM[] = { "", "M", "MM", "MMM" };
		String rangeC[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String rangeX[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String rangeI[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		return rangeM[num / 1000] + rangeC[num % 1000 / 100] + rangeX[num % 100 / 10] + rangeI[num % 10];

	}

}