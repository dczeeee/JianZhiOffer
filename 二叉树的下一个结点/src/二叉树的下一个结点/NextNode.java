package 二叉树的下一个结点;
/*
 * 题目描述
给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
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
