package ������1���ֵĴ���;

/*
 * ��Ŀ����
���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,���Ƕ��ں�����������û���ˡ�
ACMerϣ�����ǰ����,������������ձ黯,���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n ��1���ֵĴ�������
 */
public class NumberOf1Between1AndN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		System.out.println(NumberOf1Between1AndN_Solution(n));
	}
	
	public static int NumberOf1Between1AndN_Solution(int n) {
	    int count = 0;
		while(n>0) {
			String str = String.valueOf(n);
		    StringBuffer bf = new StringBuffer(str);
		    for(int i = 0;i < bf.length();++i) {
		    	if('1' == bf.charAt(i)) {
		    		count++;
		    	}
		    }
		    n--;
	    }
	    return count;
    }
}
