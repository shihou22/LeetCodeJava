package problems.easy.roman_to_integer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		int wk = 0;
		String[] hoge = new String[] { "III", "IV", "IX", "LVIII", "MCMXCIV" };
		for (String string : hoge) {
			wk = new Main().romanToInt(string);
			System.out.println(wk);
		}

	}

	public int romanToInt(String s) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int res = 0;
		boolean isP = true;
		for (int i = s.length() - 1; i >= 0; i--) {
			Character wk = s.charAt(i);
			if (i == s.length() - 1) {
				res += map.get(wk);
			} else {
				Character preWk = s.charAt(i + 1);
				if (map.get(wk) < map.get(preWk)) {
					res -= map.get(wk);
				} else {
					res += map.get(wk);
				}
			}

		}
		return res;
	}

}