/*
 * 题目描述
求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(Sum_Solution(n));
	}

	public static int Sum_Solution(int n) {
        int sum = n;
        boolean ans = n>0 && (sum+=Sum_Solution(sum-1))>0;
        return sum;
    }
}
