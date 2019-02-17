package 第一个只出现一次的字符;

/*
 * 题目描述
在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 
如果没有则返回 -1（需要区分大小写）.
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
