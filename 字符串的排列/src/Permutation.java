import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/*
 * 题目描述
输入一个字符串,按字典序打印出该字符串中字符的所有排列。
例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
输入描述:
输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
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
