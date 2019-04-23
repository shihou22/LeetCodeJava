package problems.easy.intersection_of_two_linked_lists;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		ListNode res = null;
		ListNode l1 = null;
		ListNode l2 = null;

		l1 = new ListNode(0);
		l1.next = new ListNode(9);
		l1.next.next = new ListNode(1);
		l1.next.next.next = new ListNode(2);
		l1.next.next.next.next = new ListNode(4);
		l2 = new ListNode(3);
		l2.next = l1.next.next.next;
		l2.next.next = l1.next.next.next.next;
		res = new Main().getIntersectionNode(l1, l2);//6
		System.out.println(res);

		l1 = new ListNode(4);
		l1.next = new ListNode(1);
		l1.next.next = new ListNode(8);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);
		l2 = new ListNode(5);
		l2.next = new ListNode(0);
		l2.next.next = new ListNode(1);
		l2.next.next.next = l1.next.next;
		l2.next.next.next.next = l1.next.next.next;
		l2.next.next.next.next.next = l1.next.next.next.next;
		res = new Main().getIntersectionNode(l1, l2);//6
		System.out.println(res);

		l1 = new ListNode(1);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(5);
		l1.next.next.next = new ListNode(7);
		l1.next.next.next.next = new ListNode(9);
		l1.next.next.next.next.next = new ListNode(11);
		l1.next.next.next.next.next.next = new ListNode(13);
		l1.next.next.next.next.next.next.next = new ListNode(15);
		l1.next.next.next.next.next.next.next.next = new ListNode(17);
		l1.next.next.next.next.next.next.next.next.next = new ListNode(19);
		l2 = l1.next.next.next.next.next.next.next;
		l2.next = l1.next.next.next.next.next.next.next.next;
		l2.next.next = l1.next.next.next.next.next.next.next.next.next;
		res = new Main().getIntersectionNode(l1, l2);//6
		System.out.println(res);

		l1 = new ListNode(1);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(5);
		l1.next.next.next = new ListNode(7);
		l1.next.next.next.next = new ListNode(9);
		l1.next.next.next.next.next = new ListNode(11);
		l1.next.next.next.next.next.next = new ListNode(13);
		l1.next.next.next.next.next.next.next = new ListNode(15);
		l1.next.next.next.next.next.next.next.next = new ListNode(17);
		l1.next.next.next.next.next.next.next.next.next = new ListNode(19);
		l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(5);
		l2.next.next.next = new ListNode(7);
		l2.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next = new ListNode(11);
		l2.next.next.next.next.next.next = new ListNode(13);
		l2.next.next.next.next.next.next.next = new ListNode(15);
		l2.next.next.next.next.next.next.next.next = l1.next.next.next.next.next.next.next.next;
		l2.next.next.next.next.next.next.next.next.next = l1.next.next.next.next.next.next.next.next.next;
		res = new Main().getIntersectionNode(l1, l2);//6
		System.out.println(res);
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		if (headA == headB) {
			return headA;
		}
		Set<ListNode> wk = new HashSet<ListNode>();
		wk.add(headA);
		wk.add(headB);
		while (headA != null || headB != null) {
			headA = headA == null ? null : headA.next;
			if (wk.contains(headA)) {
				return headA;
			} else if (headA != null) {
				wk.add(headA);
			}
			headB = headB == null ? null : headB.next;
			if (wk.contains(headB)) {
				return headB;
			} else if (headB != null) {
				wk.add(headB);
			}
		}

		return null;

	}

	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

}