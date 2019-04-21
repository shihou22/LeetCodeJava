package problems.easy.pascal_s_triangle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		List<List<Integer>> res;
		res = new Main().generate(5);
		System.out.println(res);
		res = new Main().generate(0);
		System.out.println(res);
	}

	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (numRows == 0) {
			return res;
		}

		for (int i = 0; i < numRows; i++) {
			List<Integer> tmp = new ArrayList<Integer>();
			for (int j = 0; j < i + 1; j++) {
				if (j == 0 || j == i) {
					tmp.add(1);
				} else {
					List<Integer> wk = res.get(i - 1);
					tmp.add(wk.get(j - 1) + wk.get(j));
				}

			}
			res.add(tmp);
		}
		return res;
	}

}