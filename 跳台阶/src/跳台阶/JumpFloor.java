package ��̨��;
/*
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
 */
public class JumpFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 10;
		System.out.println(jumpFloor(target));
	}
	public static int jumpFloor(int target) {
        int[] nums = new int[target+1];
        nums[0] = 1;
        nums[1] = 2;
        for(int i = 2;i < nums.length;i++){
            nums[i] = nums[i-1] + nums[i-2];
        }
        return nums[target-1];
    }
}
