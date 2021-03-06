package 反转链表;

/*
 * 题目描述:输入一个链表，反转链表后，输出新链表的表头。
 */

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class ListNode {
	    int val;
	    ListNode next = null;
	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
	    ListNode next = null;
	    while (head != null) {
	        next = head.next;
	        head.next = pre;
	        pre = head;
	        head = next;
	    }
	    return pre;
    }
}
