package ��ת�������С����;
/*
 * ��Ŀ����
��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� 
����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء� 
��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� 
NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 */
public class MinNumberInRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,1,2,3,4};
		System.out.println(minNumberInRotateArray(array));
	}
	
	public static int minNumberInRotateArray(int [] array) {
	    int left = 0;
	    int right = array.length-1;
	    while(left < right) {
	    	int mid = left + (right-left)/2;
	    	if(array[mid]>array[right])
	    		left = mid+1;
	    	else if(array[mid]<array[right])
	    		right = mid;
	    	else
	    		right--;
	    }
	    return array[left];
    }
}
