package ���������������;
/*
 * ��Ŀ����
HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ��
��������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
��һ�����飬��������������������еĺͣ���᲻�ᱻ������ס��(�������ĳ���������1)
 */
public class FindGreatestSumOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {6,-3,-2,7,-15,1,2,2};
		System.out.println(FindGreatestSumOfSubArray(array));
	}

	public static int FindGreatestSumOfSubArray(int[] array) {
        int res = array[0];
        int sum = 0;
        for(int arr:array) {
        	if(sum>0) {
        		sum += arr;
        	}
        	else {
        		sum = arr;
        	}
        	res = Math.max(sum, res);
        }
        return res;
    }
}
