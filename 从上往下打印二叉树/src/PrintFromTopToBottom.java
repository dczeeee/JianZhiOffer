import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


/*
 * 题目描述
从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class PrintFromTopToBottom {

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
	public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null) {
        	return list;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
        	TreeNode node = queue.poll();
        	list.add(node.val);
        	if(node.left != null) {
        		queue.add(node.left);
        	}
        	if(node.right != null) {
        		queue.add(node.right);
        	}
        }
        return list;
    }
}
