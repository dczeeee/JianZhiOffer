package ��ֵ�������η�;
/*
 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
 */
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base = 2;
		int exponent = -3;
		System.out.println(power(base, exponent));
	}
	public static double power(double base, int exponent) {
        if(exponent == 0){
            return 1.0;
        }
        double res = base;
        for(int i = 1;i < Math.abs(exponent); ++i){
            res = res * base;
        }
        return exponent > 0 ? res : 1/res;
	}
}
