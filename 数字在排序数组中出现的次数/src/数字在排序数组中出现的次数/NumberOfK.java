package ���������������г��ֵĴ���;

/*
 * ��Ŀ����
ͳ��һ�����������������г��ֵĴ�����
 */
public class NumberOfK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {};
		System.out.println(GetNumberOfK(array, 3));
	}
	
	public static int GetNumberOfK(int [] array , int k) {
		int count=0;
        for(int i=0;i<array.length;i++){
           if(array[i]==k)
               count++;
       }
        return count;
    }
}
