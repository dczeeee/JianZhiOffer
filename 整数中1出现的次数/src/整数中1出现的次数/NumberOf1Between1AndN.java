package 整数中1出现的次数;

/*
 * 题目描述
求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
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
