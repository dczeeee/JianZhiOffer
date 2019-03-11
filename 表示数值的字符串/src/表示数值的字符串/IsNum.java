package 表示数值的字符串;

/*
 * 题目描述
请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 
但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */
public class IsNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = {'5','e','2'};
		System.out.println(isNumeric(str));
	}

	public static boolean isNumeric(char[] str) {
        String string = String.valueOf(str);
        String regex = "[+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?";
        return string.matches(regex);
    }
}
