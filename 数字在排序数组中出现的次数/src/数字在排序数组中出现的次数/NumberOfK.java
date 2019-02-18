package 数字在排序数组中出现的次数;

/*
 * 题目描述
统计一个数字在排序数组中出现的次数。
 */
public class NumberOfK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {};
		System.out.println(GetNumberOfK(array, 3));
	}
	
	public static int GetNumberOfK(int [] array , int k) {
		int count=0;
        for(int i=0;i<array.length;i++){
           if(array[i]==k)
               count++;
       }
        return count;
    }
}
