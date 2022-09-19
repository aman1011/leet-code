from typing import List

class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        ans = []
        for n in range(0,len(nums)):
            sum = 0
            for i in range(0,n+1):
                sum = sum + nums[i]
            
            ans.append(sum)
            
        return ans