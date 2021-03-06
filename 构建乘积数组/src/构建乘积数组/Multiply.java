package 构建乘积数组;
/*
 * 题目描述
给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
不能使用除法。
 */
public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] multiply(int[] A) {
		int len = A.length;
		int[] B = new int[len];
		if(len != 0) {
			B[0] = 1;
			for(int i = 1;i < len;++i) {
				B[i] = B[i-1] * A[i-1];
			}
			int temp = 1;
			for(int j = len-2;j >= 0;--j) {
				temp *= A[j+1];
				B[j] *= temp;
			}
		}
		return B;
    }
}

/*
 * 解题思路：https://uploadfiles.nowcoder.com/images/20160829/841505_1472459965615_8640A8F86FB2AB3117629E2456D8C652
 */

