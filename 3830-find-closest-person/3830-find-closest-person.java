class Solution {
    public int findClosest(int x, int y, int z) {
        int result1 = Math.abs(z-x);
        int result2 = Math.abs(z-y);
        if(result1 < result2) return 1;
        else if(result1 > result2) return 2;
        else return 0;
    }
}