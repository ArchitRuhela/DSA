class Solution {
    public static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        int p = 0 ;
        for(int sp = 0 ; sp < nums.length; sp++){
            if(nums[sp] != 0){
                swap(nums, p , sp);
                p++;
            }
        }
    }
}