package ��ΪS����������;

import java.util.ArrayList;

/*
 * ��Ŀ����
����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
�������:
��Ӧÿ�����԰����������������С���������
 */
public class NumbersWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,4,7,11,16};
		int sum = 10;
		System.out.println(FindNumbersWithSum(array, sum));
	}

	public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		int low = 0;
		int high = array.length-1;
		while(low < high) {
			int tmp = sum-array[low];
			if(array[high]==tmp) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(array[low]);
				list.add(tmp);
				res.add(list);
				low++;
			}
			else if(array[high] > tmp) {
				high--;
			}
			else {
				low++;
			}
		}
		if(res.isEmpty()) {
			return new ArrayList<Integer>();
		}
		else {
			ArrayList<Integer> min = res.get(0);
			for(int i = 0;i < res.size();++i) {
				min = min.get(0)*min.get(1)<res.get(i).get(0)*res.get(i).get(1) ?min :res.get(i);
			}
			return min;
		}
    }
}
