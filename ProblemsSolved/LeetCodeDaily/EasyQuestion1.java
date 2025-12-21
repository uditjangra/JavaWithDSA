package LeetCodeDaily;

public class EasyQuestion1 {
    static class Solution3 {
        public int minOperations(int[] nums, int k) {
            int sum = 0;
            for(int i = 0; i < nums.length; i++){
                sum+=nums[i];
            }
            return sum%k;
        }
    }
}
