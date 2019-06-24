package 从尾到头打印链表;

import java.util.ArrayList;

/*
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class FromTailToHeadPrintList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class ListNode {
		int val;
		ListNode next = null;
		
		ListNode(int val){
			this.val = val;
		}
	}
	ArrayList<Integer> arraylist = new ArrayList<Integer>();
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		if(listNode!=null) {
			printListFromTailToHead(listNode.next);
			arraylist.add(listNode.val);
		}
		return arraylist;
	}
}
