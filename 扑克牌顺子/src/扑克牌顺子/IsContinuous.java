package �˿���˳��;

import java.util.ArrayList;
import java.util.HashSet;

/*
 * ��Ŀ����
LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...
��������г����5����,�����Լ�������,�����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,
�ٺ٣���������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....
LL��������,��������,������\С �����Կ����κ�����,����A����1,JΪ11,QΪ12,KΪ13��
�����5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),��So Lucky!����LL����ȥ��������Ʊ���� 
����,Ҫ����ʹ�������ģ������Ĺ���,Ȼ���������LL��������Σ� ����������˳�Ӿ����true����������false��
Ϊ�˷������,�������Ϊ��С����0��
 */
public class IsContinuous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {0,1,0,0,5};
		System.out.println(isContinuous(numbers));
	}
	
	public static boolean isContinuous(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		int count0 = 0;
		for(int i:numbers) {
			list.add(i);
			if(i != 0)
				set.add(i);
			if(i == 0)
				count0++;
		}
		if(set.size()+count0<5) {
			return false;
		}
		list.sort(null);
		if(count0 == 4) {
			return true;
		}
		else{
			if(list.get(4)-list.get(count0)<=4) {
				return true;
			}
			else {
				return false;
			}
		}
    }
}
