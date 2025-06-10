class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0 ; i < nums.length; i++){
            //The commented code will give TLE because it's using two loops, so for large arrays the code wil give Time Limited Exceeded error.
            // for(int j = i+1; j < nums.length; j++){
            //     if(nums[i] == nums[j]){
            //     return true;
            //     }
            // }
            if(s.contains(nums[i])){
                return true;
            }
            s.add(nums[i]);
        }
        return false;
    }
}