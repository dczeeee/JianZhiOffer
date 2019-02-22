package 平衡二叉树;
/*
 * 题目描述
输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class IsBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	public boolean IsBalanced_Solution(TreeNode root) {
		if (root == null) {
            return true;
        }
		int left = treeDepth(root.left);
		int right = treeDepth(root.right);
		int dif = left - right;
		if(dif > 1 || dif < -1) {
			return false;
		}
		return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
	
	public int treeDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		return Math.max(treeDepth(root.left)+1, treeDepth(root.right)+1);
	}
}
