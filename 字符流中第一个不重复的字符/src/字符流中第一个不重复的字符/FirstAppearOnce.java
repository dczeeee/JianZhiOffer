package �ַ����е�һ�����ظ����ַ�;
/*
 * ��Ŀ����
��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ������磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"��
���Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
�������:
�����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���
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
