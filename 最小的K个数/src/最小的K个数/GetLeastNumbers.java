package ��С��K����;

import java.util.List;
import java.util.ArrayList;

/*
 * ��Ŀ����
����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 */

public class GetLeastNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {4,5,1,6,2,7,3,8};
		System.out.println(GetLeastNumbers_Solution(input, 4));
	}
	
	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        List<Integer> list = new ArrayList<Integer>();
		if(k>input.length)
			return (ArrayList<Integer>) list;
        for(int i =0;i<input.length-1;i++) { 
			for(int j=0;j<input.length-i-1;j++) {
				if(input[j]<input[j+1]) {
					int temp = input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
	         	}
	     	}    
	 	}
        for(int i = input.length-1;i > input.length-k-1;--i) {
        	list.add(input[i]);
        }
        return (ArrayList<Integer>) list;
    }
}
