package ���ַ���ת��������;
/*
 * ��Ŀ����
��һ���ַ���ת����һ������(ʵ��Integer.valueOf(string)�Ĺ��ܣ�����string����������Ҫ��ʱ����0)��
Ҫ����ʹ���ַ���ת�������Ŀ⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0��
��������:
����һ���ַ���,����������ĸ����,����Ϊ��
�������:
����ǺϷ�����ֵ����򷵻ظ����֣����򷵻�0
ʾ��1
����
+2147483647
    1a33
���
2147483647
    0
 */
public class Str2Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "-2147483648";
		System.out.println(StrToInt(str));
	}

	public static int StrToInt(String str) {
		if(str.isEmpty())
			return 0;
        int res = 0;
        for(int i = str.charAt(0)=='+'||str.charAt(0)=='-' ? 1 : 0;i <str.length();++i) {
        	if(str.charAt(i)>=48 && str.charAt(i)<=57) {
        		res = (str.charAt(i)-48) + res * 10;
        	}
        	else {
        		return 0;
        	}
        }
        if(str.charAt(0)=='-') {
        	res = -1 * res;
        }
        return res;
    }
}
