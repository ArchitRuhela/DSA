class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int movi=0, swapi=0;
		while(movi < nums.size()) {
			if (nums[movi] != 0) {
			    swap(nums, swapi, movi);
			    swapi++; movi++;
			} else movi++;
		}
			
		while(swapi<nums.size()) nums[swapi++] = 0;
    }

private:
    void swap(vector<int>& arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
};