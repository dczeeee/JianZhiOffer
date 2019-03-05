package 顺时针打印矩阵;

import java.util.ArrayList;

/*
 * 题目描述
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class PrintMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println(printMatrix(matrix));
	}
	
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(matrix.length==0)
			return res;
		//行数
		int m = matrix.length;
		//列数
		int n = matrix[0].length;
		if(n==0)
			return res;
		//层数
		int layers = (Math.min(m, n)-1)/2+1;
		for(int i = 0;i < layers;++i) {
			//左到右
			for(int j = i;j<n-i;++j)
				res.add(matrix[i][j]);
			//右上到右下
			for(int k = i+1;k<m-i;++k)
				res.add(matrix[k][n-1-i]);
			//右到左
			for(int p = n-2-i;p>=i&&(m-1-i!=i);--p)
				res.add(matrix[m-1-i][p]);
			//左下到左上
			for(int q = m-2-i;q>i&&(n-1-i!=i);--q)
				res.add(matrix[q][i]);
		}
		return res;
    }
}
