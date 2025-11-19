// class Solution {
//     public int findFinalValue(int[] nums, int original) {
//         while(true){
//             boolean flag = false;
//             for(int i = 0 ; i < nums.length; i++){
//                 if(nums[i] == original){
//                     original = original * 2;
//                     flag = true;
//                 }
//             }
//             if(flag){
//                 continue;
//             }
//             else{
//                 break;
//             }
//         }
//         return original;
//     }
// }

// class Solution{
//     public int findFinalValue(int[] nums, int original){
//         HashMap<Integer, Integer> hush = new HashMap<Integer, Integer>();
//         for(int i = 0 ; i < nums.length; i++){
//             hush.put(nums[i],1);
//         }
//         while(true){
//             if(hush.containsKey(original)){
//                 original = original * 2;
//             }
//             else {
//                 break;
//             }
//         }
//         return original;
//     }
// }

class Solution{
    public int findFinalValue(int[] nums, int original){
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] == original){
                original = 2 * original;
            }
        }
        return original;
    }
}