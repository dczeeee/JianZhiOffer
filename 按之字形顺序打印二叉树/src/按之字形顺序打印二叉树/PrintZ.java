package 按之字形顺序打印二叉树;

import java.util.ArrayList;

/*
 * 题目描述
请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，
第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class PrintZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class TreeNode{
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		TreeNode(int val){
			this.val = val;
		}
	}
	
	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		
    }
}
