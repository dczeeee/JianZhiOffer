package ����ת�ַ���;
/*
 * ��Ŀ����
�����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵����񣬾������ַ���ģ�����ָ�����������
����һ���������ַ�����S���������ѭ������Kλ������������
���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
 */
public class LeftRotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcXYZdef";
		int n = 3;
		System.out.println(leftRotateString(str, n));
	}
	public static String leftRotateString(String str,int n) {
		if(str.isEmpty()) {
			return "";
		}
		else if(n > str.length()) {
			n %= str.length();
		}
        StringBuffer res = new StringBuffer();
        res.append(str.substring(n, str.length()));
        res.append(str.substring(0, n));
        return String.valueOf(res);
    }
}
