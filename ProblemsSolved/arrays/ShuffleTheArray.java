package arrays;

public class ShuffleTheArray {
    static class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] ans = new int[n];
            for(int i = 1; i <= n * 2;i++){
                if(i%2!=0){
                    ans[i] = nums[i];
                }else{
                    ans[i] = nums[n+i];
                }
            }
            return ans;
        }
    }
}
