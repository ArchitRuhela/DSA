class Solution(object):
    def moveZeroes(self, nums):
        movi=0
        swapi=0
        while(movi<len(nums)):
            if(nums[movi] != 0):
                nums[movi], nums[swapi] = nums[swapi], nums[movi]
                swapi += 1
                movi += 1
            else: movi += 1
        
        while(swapi<len(nums)):
            nums[swapi] = 0
            swapi += 1
        