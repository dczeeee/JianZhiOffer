package 把数组排成最小的数;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * 题目描述
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
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
