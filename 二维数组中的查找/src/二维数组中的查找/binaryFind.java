package 二维数组中的查找;
/*
 * 题目描述
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class binaryFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean Find(int target,int[][] array) {
		int col = array[0].length-1;
		int row = array.length-1;
		int i = 0;
		while(i <= row && col >= 0) {
			if(target == array[i][col])
				return true;
			else if(target > array[i][col])
				i++;
			else
				col--;
		}
		return false;
	}
}
