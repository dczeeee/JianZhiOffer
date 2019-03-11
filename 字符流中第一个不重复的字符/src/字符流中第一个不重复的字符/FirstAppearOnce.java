package 字符流中第一个不重复的字符;
/*
 * 题目描述
请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
输出描述:
如果当前字符流没有存在出现一次的字符，返回#字符。
 */
public class FirstAppearOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int[] res = new int[256];
	int index = 1;
	//Insert one char from stringstream
    public void Insert(char ch)
    {
    	if(res[ch]==0) {
    		res[ch] = index++;
    	}
    	else {
    		res[ch] = -1;
    	}
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	int temp = Integer.MAX_VALUE;
    	char ch = '#';
    	for(int i = 0;i < 256;++i) {
    		if(res[i]!=0&&res[i]!=-1&&res[i]<temp) {
    			temp = res[i];
    			ch = (char)i;
    		}
    	}
    	return ch;
    }
}
