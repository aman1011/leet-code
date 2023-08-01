class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums3 = nums1 + nums2
        nums3.sort()
        length = len(nums3)
        half = int(length / 2)

        if length % 2 == 0:          
            ans = (nums3[half] + nums3[half - 1]) / 2
        else:
            ans = nums3[half]

        return ans