package 删除链表中重复的结点;
/*
 * 题目描述
在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 
例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class DeleteDuplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "fgs";
		str = str.toUpperCase();
		System.out.println(str);
	}
	
	public class ListNode{
		int val;
		ListNode next = null;
		ListNode(int val){
			this.val = val;
		}
	}
	
	public ListNode deleteDuplication(ListNode pHead)
    {
		if(pHead==null)
			return null;
		return null;
    }
}
