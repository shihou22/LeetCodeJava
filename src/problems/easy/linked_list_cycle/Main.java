package problems.easy.linked_list_cycle;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		boolean res = false;
		ListNode l1 = null;
		l1 = new ListNode(3);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(0);
		l1.next.next.next = new ListNode(-4);
		res = new Main().hasCycle(l1);//true
		System.out.println(res);

		l1 = new ListNode(1);
		l1.next = new ListNode(2);
		res = new Main().hasCycle(l1);//false
		System.out.println(res);

		l1 = new ListNode(1);
		res = new Main().hasCycle(l1);//false
		System.out.println(res);
	}

	public boolean hasCycle(ListNode head) {
		ListNode base = head;
		ListNode next = head;
		while (base != null) {
			if (next == null || next.next == null) {
				return false;
			}
			base = base.next;
			next = next.next.next;
			if (base == next) {
				return true;
			}
		}
		return false;
	}

	public boolean hasCycleOrigin(ListNode head) {
		ListNode base = head;
		Set<ListNode> memo = new HashSet<ListNode>();
		while (base != null) {
			if (memo.contains(base)) {
				return true;
			} else {
				memo.add(base);
			}
			base = base.next;
		}
		return false;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}