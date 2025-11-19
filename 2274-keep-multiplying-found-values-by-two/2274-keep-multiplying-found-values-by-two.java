class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(true){
            boolean flag = false;
            for(int i = 0 ; i < nums.length; i++){
                if(nums[i] == original){
                    original = original * 2;
                    flag = true;
                }
            }
            if(flag){
                continue;
            }
            else{
                break;
            }
        }
        return original;
    }
}