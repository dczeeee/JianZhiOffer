package �������ľ���;
/*
 * ��Ŀ����
���������Ķ�����������任ΪԴ�������ľ���
��������:
�������ľ����壺Դ������ 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	���������
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 */
public class Mirror {

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
	public void mirror(TreeNode root) {
        TreeNode temp;
        if(root != null) {
        	temp = root.left;
        	root.left = root.right;
        	root.right = temp;
        	if(root.left != null) {
        		mirror(root.left);
        	}
        	if(root.right != null) {
        		mirror(root.right);
        	}
        }
    }
}
