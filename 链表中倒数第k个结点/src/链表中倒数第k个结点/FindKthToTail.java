package 链表中倒数第k个结点;

public class FindKthToTail {

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
	public ListNode findKthToTail(ListNode head,int k) {
		if(head == null || k <= 0) {
			return null;
		}
		ListNode pre = head;
		ListNode last = head;
		for(int i = 1;i < k;++i) {
			if(pre.next != null) {
				pre = pre.next;
			}
			else {
				return null;
			}
		}
		while(pre.next != null) {
			pre = pre.next;
			last = last.next;
		}
		return last;
    }
}
