package �����е������;

/*
 * ��Ŀ����
�������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�
����һ������,�����������е�����Ե�����P������P��1000000007ȡģ�Ľ������� �����P%1000000007
��������:
��Ŀ��֤�����������û�е���ͬ������

���ݷ�Χ��

	����%50������,size<=10^4

	����%75������,size<=10^5

	����%100������,size<=2*10^5

ʾ��1
����
1,2,3,4,5,6,7,0
���
7
 */
public class InversePairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,4,5,6,7,0};
		System.out.println(InversePairs(array));
	}

	public static int InversePairs(int [] array) {
		int count = 0;
        for(int i = 0;i<array.length-1;++i) {
        	for(int j = i+1;j<array.length;++j) {
        		if(array[i] > array[j]) {
        			count++;
        		}
        	}
        }
        return count%1000000007;
    }
}

/*
 * ʱ�临�Ӷȳ��ˣ�����ԭ���������
 */