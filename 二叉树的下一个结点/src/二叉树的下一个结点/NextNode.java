package ����������һ�����;
/*
 * ��Ŀ����
����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�
ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
 */
public class NextNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class TreeLinkNode {
		int val;
	    TreeLinkNode left = null;
	    TreeLinkNode right = null;
	    TreeLinkNode next = null;

	    TreeLinkNode(int val) {
	        this.val = val;
	    }
	}
	public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null)
        	return null;
        TreeLinkNode node;
        if(pNode.right!=null) {
        	node = pNode.right;
        	while(node.left!=null) {
        		node = node.left;
        	}
        	return node;
        }
        node = pNode;
        while(node.next!=null) {
        	if(node.next.left==node) {
        		return node.next;
        	}
        	node = node.next;
        }
        return null;
    }
}
