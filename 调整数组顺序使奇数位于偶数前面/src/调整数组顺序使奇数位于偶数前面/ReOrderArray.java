package ��������˳��ʹ����λ��ż��ǰ��;
/*
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
 */
public class ReOrderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,5,3,8,6,4,9,7};
		reOrderArray(array);
		for(int i = 0;i < array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void reOrderArray(int[] array) {
        for(int i = 0;i < array.length;++i) {
        	for(int j = 0;j < array.length-1;++j) {
	        	if(array[j]%2 == 0 && array[j+1]%2 != 0) {
	        		int temp = array[j];
	        		array[j] = array[j+1];
	        		array[j+1] = temp;
	        	}
        	}
        }
    }
}
