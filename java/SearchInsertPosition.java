//Solution for question https://leetcode.com/problems/search-insert-position/
package java;

public class SearchInsertPosition {
    class Solution {
        public int binarySearch(int start,int end,int[] nums,int target) {
            int mid=(start)+(end-start)/2;
            
            if(start==end-1 && target>nums[start]&&target<=nums[end])
                return start+1;
            else if(start==end-1 && target<nums[start])
                return start;
            
            if(target==nums[mid])
                return mid;
            else if(target>nums[mid])
                return binarySearch(mid,end,nums,target);
            else if(target<nums[mid])
            return binarySearch(start,mid,nums,target);
            return start;
        }
        
        public int searchInsert(int[] nums, int target) {
            if(target==nums[nums.length-1])
                return nums.length-1;
            if(target<nums[0])
                return 0;
            if(target>nums[nums.length-1])
                return nums.length;
            
            int index = binarySearch(0,nums.length-1,nums,target);
            return index;
        }
        
    }
    
}
