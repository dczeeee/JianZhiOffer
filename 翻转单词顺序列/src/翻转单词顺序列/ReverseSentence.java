package ��ת����˳����;
/*
 * ��Ŀ����
ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�
ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼��
���磬��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ�
��ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 */
public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "student. a am I";
		System.out.println(reverseSentence(str));
	}

	public static String reverseSentence(String str) {
		StringBuffer res = new StringBuffer();
        int start = str.length();
        int end = str.length();
        while(start > 0) {
        	if(str.charAt(end-1)!=' ' && str.charAt(start-1)!=' ') {
        		start--;
        	}
        	if(str.charAt(end-1)!=' ' && str.charAt(start-1)==' ' || start == 1) {
        		if(start == 1) {
        			res.append(str.substring(0, end));
        		}else {
	        		res.append(str.substring(start, end));
	        		res.append(" ");
        		}
        		start--;
        		end = start;
        	}
        }
        return String.valueOf(res);
    }
}

/*
 * ţ���Դ���������ʾ����Խ�磬���ﲻ�ᰡ������
 */

