package 数组中只出现一次的数字;

import java.util.List;
import java.util.ArrayList;

/*
 * 题目描述
一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
 */
public class NumsAppearOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,2,1,3,4,4};
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		FindNumsAppearOnce(array, num1, num2);
	}
	//num1,num2分别为长度为1的数组。传出参数
	//将num1[0],num2[0]设置为返回结果
	public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i < array.length;++i) {
        	int num = array[i];
        	int count = 0;
        	int flag = 0;
        	for(int j = 0;j < array.length;++j) {
        		if(i != j && num == array[j])
        			count++;
        		if(count > 0)
        			continue;
        	}
        	if(count == 0) {
        		list.add(num);
        	}
        }
        num1[0] = list.get(0);
        num2[0] = list.get(1);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }
}
