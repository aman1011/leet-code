//Solution for question https://leetcode.com/problems/sqrtx/submissions/
package java;

public class SqrtUsingBinarySearch {
    class Solution {
        public int mySqrt(int x) {
            if(x==0)
                return 0;
            if(x==1)
                return 1;
            return binarySearch(0,x,x);
        }
        public int binarySearch(int left,int right,int target) {
            int mid=left+(right-left)/2;
      
            if(mid>target/mid)
             return binarySearch(left,mid-1,target);
            else {
                if(mid+1>target/(mid+1))
                    return mid;
                return binarySearch(mid+1,right,target);
            }
            
            
        }
    }
    
}
