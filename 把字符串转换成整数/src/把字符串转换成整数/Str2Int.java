package 把字符串转换成整数;
/*
 * 题目描述
将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
输入描述:
输入一个字符串,包括数字字母符号,可以为空
输出描述:
如果是合法的数值表达则返回该数字，否则返回0
示例1
输入
+2147483647
    1a33
输出
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
