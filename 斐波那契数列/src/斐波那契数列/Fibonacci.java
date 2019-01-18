package ì³²¨ÄÇÆõÊýÁÐ;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 39;
		System.out.println(Fibonacci(n));
	}
	public static int Fibonacci(int n) {
        int[] f = new int[40];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2;i <= 39;i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
