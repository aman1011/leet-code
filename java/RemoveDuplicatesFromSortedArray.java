//Solution for https://leetcode.com/problems/remove-duplicates-from-sorted-array/
package java;

public class RemoveDuplicatesFromSortedArray {

    class Solution {
        public int removeDuplicates(int[] nums) {
            int count=0;
            int i=0,j=1;
            while(i<nums.length && j<nums.length)
            {
                if(nums[i]==nums[j]) {
                    j++;
                    count++;
                }
               else if(nums[i]!=nums[j]){
                   i++;
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    j++;
               }
               
                    
            }
            return nums.length-count;
            //Less memory taking solution
            // while(i<nums.length)
            // {
            //    if(nums[i]!=nums[i-1]){
            //       nums[j++]=nums[i];
                    
            //    }
            //     i++;
               
                    
            // }
            // return j;
            
        }
    }
    
}
