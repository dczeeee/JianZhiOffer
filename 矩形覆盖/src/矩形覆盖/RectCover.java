package ���θ���;
/*
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 */
public class RectCover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int rectCover(int target) {
		if(target <= 0) {
			return 0;
		}
		else if(target == 1){
            return 1;
        }
        else if(target == 2){
            return 2;
        }
        else{
            return rectCover(target-1)+rectCover(target-2);
        }
    }
}
