package ˳ʱ���ӡ����;

import java.util.ArrayList;

/*
 * ��Ŀ����
����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
���磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
�����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
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
		//����
		int m = matrix.length;
		//����
		int n = matrix[0].length;
		if(n==0)
			return res;
		//����
		int layers = (Math.min(m, n)-1)/2+1;
		for(int i = 0;i < layers;++i) {
			//����
			for(int j = i;j<n-i;++j)
				res.add(matrix[i][j]);
			//���ϵ�����
			for(int k = i+1;k<m-i;++k)
				res.add(matrix[k][n-1-i]);
			//�ҵ���
			for(int p = n-2-i;p>=i&&(m-1-i!=i);--p)
				res.add(matrix[m-1-i][p]);
			//���µ�����
			for(int q = m-2-i;q>i&&(n-1-i!=i);--q)
				res.add(matrix[q][i]);
		}
		return res;
    }
}
