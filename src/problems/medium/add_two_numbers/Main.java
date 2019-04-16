package problems.medium.add_two_numbers;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode res = new Main().addTwoNumbers(l1, l2);

		while (res != null) {
			System.out.println(res.val);
			res = res.next;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		//参照保持用
		ListNode wk1 = l1;
		ListNode wk2 = l2;
		ListNode res = new ListNode(0);
		//ダミー参照の保持用
		ListNode tmpRes = res;
		//計算用
		int amari = 0;
		while (wk1 != null || wk2 != null) {
			int val1 = wk1 == null ? 0 : wk1.val;
			int val2 = wk2 == null ? 0 : wk2.val;
			int tmp = val1 + val2 + amari;
			res.next = new ListNode(tmp % 10);
			res = res.next;
			amari = tmp / 10;
			/*
			 * wk1 || wk2 がnullであるならば、nullを返す
			 * つまり、wk1 || wk2は桁数が足りないということ
			 */

			wk1 = wk1 == null ? null : wk1.next;
			wk2 = wk2 == null ? null : wk2.next;
		}
		if (amari > 0) {
			res.next = new ListNode(amari);
		}

		return tmpRes.next;
	}

	// Definition for singly-linked list.
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}