//Solution for https://leetcode.com/problems/plus-one/
package java;

public class PlusOneInIntegerArray {
    class Solution {
        public int[] plusOne(int[] digits) {
            for(int i=digits.length-1;i>=0;i--) {
                digits[i]+=1;
                if(digits[i]<=9)
                    return digits;
                digits[i]=0;
            }
            int[] arr = new int[digits.length+1];
            arr[0]=1;
            return arr;
            
        }
    }
    
}
