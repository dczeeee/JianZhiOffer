package ɾ���������ظ��Ľ��;
/*
 * ��Ŀ����
��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣 
���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
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
