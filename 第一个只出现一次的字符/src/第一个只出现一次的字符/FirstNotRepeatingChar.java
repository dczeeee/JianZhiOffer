package ��һ��ֻ����һ�ε��ַ�;

/*
 * ��Ŀ����
��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, 
���û���򷵻� -1����Ҫ���ִ�Сд��.
 */
public class FirstNotRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "googgle";
		System.out.println(FirstNotRepeatingChar(str));
	}
	
	public static int FirstNotRepeatingChar(String str) {
        char[] c = str.toCharArray();
        int[] a = new int['z'+1];
        for(char i:c) {
        	a[(int) i]++;
        }
        for(int i = 0;i < c.length;++i) {
        	if(a[(int)c[i]] == 1) {
        		return i;
        	}
        }
        return -1;
    }
}
