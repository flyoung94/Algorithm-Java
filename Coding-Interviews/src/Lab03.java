/**
 * 面试题03：数组中重复的数字
 */
public class Lab03 {

    public int findRepeatNumber(int[] nums){
        int length = nums.length;
        int[] hash_array = new int[length];
        for (int i = 0; i < length; i++) {
            hash_array[nums[i]]++;
        }
        for (int j = 0; j < length; j++) {
            if(hash_array[j]>1)
                return j;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
