package �滻�ո�;
/*
 * ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
public class ReplaceSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("We Are Happy");
		System.out.println(replaceSpace(str));
	}

	public static String replaceSpace(StringBuffer str) {
    	for(int i = 0;i < str.length();++i) {
    		if(str.charAt(i)==' ') {
    			str.replace(i, i+1, "%20");
    		}
    	}
    	return str.toString();
    }
}
