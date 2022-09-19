class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        sum = 0
        length_of_list = len(nums)
        
        for num in nums:
            sum = sum + num
        
        if (sum - nums[0]) == 0:
            return 0
  
        lsum = 0 
        for i in range(1, length_of_list):
            
            lsum = lsum + nums[i-1]
            rsum = sum - lsum - nums[i]

            if lsum == rsum:
                return i
            
        if (sum - nums[length_of_list - 1]) == 0:
            return length_of_list - 1
                
        return -1
        