package problems.easy.add_binary;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String res = "";
		//		res = new Main().addBinary("11", "1");//100
		//		System.out.println(res);

		res = new Main().addBinary("0", "0");//100
		System.out.println(res);

		//		res = new Main().addBinary("1010", "1011");//10101
		//		System.out.println(res);
		//
		//		res = new Main().addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
		//				"110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");//10101
		//		System.out.println(res);

	}

	public String addBinary(String a, String b) {

		StringBuilder s = new StringBuilder();

		int carry = 0;

		int aI = a.length() - 1;
		int bI = b.length() - 1;

		while (aI >= 0 || bI >= 0) {

			int aC = 0;
			int bC = 0;

			if (aI >= 0) {
				aC = a.charAt(aI) - '0';
				aI--;
			}
			if (bI >= 0) {
				bC = b.charAt(bI) - '0';
				bI--;
			}

			/*
			 * その桁のトータル
			 */
			int sum = carry + aC + bC;

			/*
			 * 次に持ち越すか？
			 * carry + aC + bC=3ならcarry=1
			 * carry + aC + bC=2ならcarry=1
			 * carry + aC + bC=1ならcarry=0
			 * carry + aC + bC=0ならcarry=0
			 */
			carry = sum >= 2 ? 1 : 0;
			/*
			 * 合計は、
			 * carry + aC + bC=3なら1
			 * carry + aC + bC=2なら0
			 * carry + aC + bC=1なら1
			 * carry + aC + bC=0なら0
			 */
			sum = sum % 2;
			s.append(sum);
		}
		/*
		 * 残りのマージ
		 */
		if (carry > 0) {
			s.append(1);
		}
		s.reverse();
		return s.toString();

	}

}