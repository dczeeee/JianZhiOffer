package �����г��ִ�������һ�������;

import java.util.HashSet;
import java.util.Set;

/*
 * ��Ŀ����
��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
 */
public class MoreThanHalfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,2,2,2,5,4,2};
		System.out.println(MoreThanHalfNum_Solution(array));
	}

	public static int MoreThanHalfNum_Solution(int [] array) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i : array) {
			set.add(i);
		}
        for(int i = 0;i < set.size();++i) {
        	int count = 0;
        	int num = (int) set.toArray()[i];
        	for(int j = 0;j < array.length;++j) {
        		if(num == array[j]) {
        			count++;
        		}
        	}
        	if(count>array.length/2) {
        		return num;
        	}
        }
        return 0;
    }
}
