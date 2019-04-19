package problems.easy.merge_two_sorted_lists;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		ListNode res = null;
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		//		res = new Main().mergeTwoLists(l1, l2);
		//		res = new Main().mergeTwoLists(null, null);
		//		res = new Main().mergeTwoLists(null, new ListNode(0));
		res = new Main().mergeTwoLists(new ListNode(5), l1);
		System.out.println(res);
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null && l2 == null) {
			return null;
		}

		List<Integer> wkList = new ArrayList<Integer>();
		while (true) {
			if (l1 == null && l2 == null) {
				break;
			}
			if (l1 != null) {
				wkList.add(l1.val);
			}
			if (l2 != null) {
				wkList.add(l2.val);
			}
			l1 = l1 != null ? l1.next : null;
			l2 = l2 != null ? l2.next : null;
		}

		Collections.sort(wkList);

		ListNode node = new ListNode(-9);
		ListNode tmp = node;
		for (Integer val : wkList) {
			tmp.next = new ListNode(val);
			tmp = tmp.next;
		}

		return node.next;

	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}