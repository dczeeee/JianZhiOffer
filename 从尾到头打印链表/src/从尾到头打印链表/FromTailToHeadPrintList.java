package ��β��ͷ��ӡ����;

import java.util.ArrayList;

/*
 * ����һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList��
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
