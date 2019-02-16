import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/*
 * ��Ŀ����
����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
��������:
����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��
 */

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		System.out.println(Permutation(str));
	}

	public static ArrayList<String> Permutation(String str) {
		List<String> resultList = new ArrayList<String>();
		if(str.length() == 0) {
			return (ArrayList<String>) resultList;
		}
		fun(str.toCharArray(),resultList,0);
		Collections.sort(resultList);
		return (ArrayList<String>) resultList;
    }
	
	private static void fun(char[] ch,List<String> list,int i) {
		if(i == ch.length-1) {
			if(!list.contains(new String(ch))) {
				list.add(new String(ch));
				return;
			}
		}
		else {
			for(int j = i;j<ch.length;++j) {
				swap(ch,i,j);
				fun(ch,list,i+1);
				swap(ch,i,j);
			}
		}
	}
	
	private static void swap(char[] str,int i,int j) {
		if(i != j) {
			char t = str[i];
			str[i] = str[j];
			str[j] = t;
		}
	}
}
