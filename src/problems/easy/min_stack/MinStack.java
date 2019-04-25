package problems.easy.min_stack;

import java.io.IOException;

public class MinStack {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		int res = 0;
		MinStack obj = new MinStack();
		obj.push(-2);
		obj.push(0);
		obj.push(-3);
		obj.push(-10);
		obj.push(-9);
		obj.push(1);
		obj.push(2);
		//		int p3 = obj.getMin();
		//		System.out.println(p3);//-3
		//		obj.pop();
		//		p3 = obj.top();
		//		System.out.println(p3);//0
		//		p3 = obj.getMin();
		//		System.out.println(p3);//-2
		//
		//		obj.push(-10);
		//		obj.push(-9);
		//
		//		p3 = obj.top();
		//		System.out.println(p3);//0
		int p3 = obj.getMin();
		System.out.println(p3);//-2
	}

	private int A[];
	private int aindex;

	public MinStack() {
		A = new int[10];
		aindex = -1;
	}

	public void push(int x) {
		if (A.length - aindex <= 2) {
			A = addspace(A);
		}
		if (aindex == -1) {
			A[aindex + 1] = x;
			A[aindex + 2] = x;
			aindex += 2;
		} else {
			if (A[aindex] > x) {
				A[aindex + 1] = x;
				A[aindex + 2] = x;
				aindex += 2;
			} else {
				A[aindex + 1] = x;
				A[aindex + 2] = A[aindex];
				aindex += 2;
			}
		}
	}

	public void pop() {
		if (aindex > 0) {
			aindex -= 2;
		} else {
			aindex = -1;
		}
	}

	public int top() {
		if (aindex > 0) {
			return A[aindex - 1];
		} else
			return -1;
	}

	public int getMin() {
		if (aindex > 0) {
			return A[aindex];
		} else
			return -1;
	}

	private int[] addspace(int[] A) {
		int[] B = new int[2 * A.length];
		for (int i = 0; i <= aindex; i++) {
			B[i] = A[i];
		}
		return B;
	}
}