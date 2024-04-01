
//Time complexity= O(n+m)

public class MergeTwoSortedList {
	public static class ListNode {
		int val;
		ListNode next;

		public ListNode(int val) {
			this.val = val;
		}

		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode merge(ListNode list1, ListNode list2) {
		ListNode temp = new ListNode(0);
		ListNode curr = temp;

		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				curr.next = list1;
				list1 = list1.next;
			} else {
				curr.next = list2;
				list2 = list2.next;
			}
			curr = curr.next;
		}
		if (list1 != null) {
			curr.next = list1;
			list1 = list1.next;
		}
		if (list2 != null) {
			curr.next = list2;
			list2 = list2.next;
		}
		return temp.next;
	}

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(3);
		list1.next.next = new ListNode(5);

		ListNode list2 = new ListNode(2);
		list2.next = new ListNode(4);
		list2.next.next = new ListNode(6);

		ListNode list3 = merge(list1, list2);
		ListNode current = list3;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}

	}

}
