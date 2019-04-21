package problems.easy.remove_duplicates_from_sorted_list;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		ListNode res = null;
		ListNode wk = new ListNode(1);
		ListNode tmp = wk;
		tmp.next = new ListNode(1);
		tmp = tmp.next;
		tmp.next = new ListNode(2);
		tmp = tmp.next;
		tmp.next = new ListNode(2);
		tmp = tmp.next;
		tmp.next = new ListNode(3);
		tmp = tmp.next;
		tmp.next = new ListNode(3);
		tmp = tmp.next;
		//		res = new Main().deleteDuplicates(wk);//6
		//		System.out.println(res);
		//
		//		wk = new ListNode(1);
		//		res = new Main().deleteDuplicates(wk);//6
		//		System.out.println(res);

		wk = new ListNode(0);
		tmp = wk;
		tmp.next = new ListNode(0);
		tmp = tmp.next;
		tmp.next = new ListNode(3);
		tmp = tmp.next;
		res = new Main().deleteDuplicates(wk);//6
		System.out.println(res);
	}

	public ListNode deleteDuplicates(ListNode head) {

		if (head == null) {
			return null;
		}

		ListNode res = new ListNode(0);
		ListNode tmp = res;
		tmp.next = new ListNode(head.val);
		tmp = tmp.next;

		ListNode input = head;

		while (input != null) {
			if (input.val == tmp.val) {
				input = input.next;
			} else {
				tmp.next = new ListNode(input.val);
				tmp = tmp.next;
			}
		}

		return res.next;
	}

	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}