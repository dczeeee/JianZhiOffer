package ��ά�����еĲ���;
/*
 * ��Ŀ����
��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
�����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
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
