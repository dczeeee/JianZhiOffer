package �������ų���С����;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * ��Ŀ����
����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 */
public class PrintMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {3,32,321};
		System.out.println(PrintMinNumber(numbers));
	}
	public static String PrintMinNumber(int [] numbers) {
		String s ="";
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i:numbers) {
			list.add(i);
		}
		
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				String s1 = o1+""+o2;
				String s2 = o2+""+o1;
				return s1.compareTo(s2);
			}
		});
		
		for(int j:list) {
			s += j;
		}
		return s;
    }
}
