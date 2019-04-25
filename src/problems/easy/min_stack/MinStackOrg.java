package problems.easy.min_stack;

import java.io.IOException;
import java.util.ArrayList;

public class MinStackOrg {

	public static void main(String[] args) throws IOException {
		int res = 0;
		MinStackOrg obj = new MinStackOrg();
		obj.push(-2);
		obj.push(0);
		obj.push(-3);
		int p3 = obj.getMin();
		System.out.println(p3);//-3
		obj.pop();
		int p4 = obj.top();
		System.out.println(p4);//0
		int p5 = obj.getMin();
		System.out.println(p5);//-2
	}

	/** initialize your data structure here. */
	public MinStackOrg() {

		body = new ArrayList<Integer>();
	}

	private ArrayList<Integer> body;
	int index = -1;

	public void push(int x) {
		body.add(x);
		index++;
	}

	public void pop() {
		body.remove(index);
		index--;
	}

	public int top() {
		return body.get(index);
	}

	public int getMin() {
		if (body.size() == 0) {
			return 0;
		}
		int min = body.get(0);
		for (Integer integer : body) {
			min = Integer.min(min, integer);
		}
		return min;
	}

}