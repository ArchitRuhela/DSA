class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // for(int i = 0 ; i<nums.length; i++){
        //     for(int j = i + 1 ; j < nums.length; j++){
        //         int absolutediff = Math.abs(i-j);
        //         if(nums[i] == nums[j] && absolutediff <= k ){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        Map<Integer,Integer> mapi = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            int var = nums[i];
            if(mapi.containsKey(var) && i - mapi.get(var) <= k){
                return true;
            }
            mapi.put(var, i);
        }
        return false;
    }
}