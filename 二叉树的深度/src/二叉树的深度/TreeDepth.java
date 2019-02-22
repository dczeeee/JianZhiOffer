package 二叉树的深度;

public class TreeDepth {

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
    public int TreeDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return Math.max(1+TreeDepth(root.left), 1+TreeDepth(root.right));
        
  
    }
}
