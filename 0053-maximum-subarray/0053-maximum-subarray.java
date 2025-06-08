class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int prevSum = nums[0];
        for(int i = 1 ; i < n ; i++){
            prevSum = Math.max(prevSum + nums[i] , nums[i]);
            maxSum = Math.max(maxSum, prevSum);
        }
        return maxSum;
    }
}