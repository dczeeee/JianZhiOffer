package 数组中出现次数超过一半的数字;

import java.util.HashSet;
import java.util.Set;

/*
 * 题目描述
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class MoreThanHalfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,2,2,2,5,4,2};
		System.out.println(MoreThanHalfNum_Solution(array));
	}

	public static int MoreThanHalfNum_Solution(int [] array) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i : array) {
			set.add(i);
		}
        for(int i = 0;i < set.size();++i) {
        	int count = 0;
        	int num = (int) set.toArray()[i];
        	for(int j = 0;j < array.length;++j) {
        		if(num == array[j]) {
        			count++;
        		}
        	}
        	if(count>array.length/2) {
        		return num;
        	}
        }
        return 0;
    }
}
