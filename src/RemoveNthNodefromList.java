import java.util.Scanner;

//time complexity =O(n)

public class RemoveNthNodefromList {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode temp = head;

		int sz = 0;
		while (temp != null) {
			temp = temp.next;
			sz++;
		}

		int i = 0;
		int iToFind = sz - n;
		temp = dummy;
		while (i < iToFind) {
			temp = temp.next;
			i++;
		}
		temp.next = temp.next.next;

		return dummy.next;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);

		System.out.println("Enter the node to be deleted");
		int n = sc.nextInt();

		ListNode res = removeNthFromEnd(head, n);
		while (res != null) {
			System.out.print(res.val + " ");
			res = res.next;
		}
	}

}
