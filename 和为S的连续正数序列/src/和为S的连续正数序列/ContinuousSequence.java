package ��ΪS��������������;

import java.util.ArrayList;

/*
 * ��Ŀ����
С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
���ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
�������:
������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
 */
public class ContinuousSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		int low = 1;
		int high = 2;
		while(high > low) {
			int tmp = (low+high)*(high-low+1)/2;
			if(tmp == sum) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				for(int i = low;i <= high;++i) {
					list.add(i);
				}
				res.add(list);
				low++;
			}
			else if(tmp < sum) {
				high++;
			}
			else {
				low++;
			}
		}
		return res;
    }
}
