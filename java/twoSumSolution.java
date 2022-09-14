package java;

// O(n) solution to problem of two sum https://leetcode.com/problems/two-sum/
import java.util.HashMap;

public class twoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        HashMap<Integer,Integer> data = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(data.containsKey(nums[i]))
            {
                arr[0]=i;
                arr[1]=data.get(nums[i]);
            } 
            else {
                data.put(target-nums[i],i);
            }
        }
        
        return arr;
    }
}
