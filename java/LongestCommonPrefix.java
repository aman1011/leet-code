// Solution to problem https://leetcode.com/problems/longest-common-prefix/
package java;

public class LongestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            String result=strs[0];
            for(String s:strs)
            {
               result = compareData(result,s);
            }
            return result;
             
    }
        public int minString(String s,String k) {
           if(s.length()<k.length())
               return s.length();
            
            
            return k.length();
        }
        public String compareData(String s,String k)
        {
            int length=minString(s,k);
            int i=0,j=0;
            while(i<length &&j<length)
            {
                if(s.charAt(i)!=k.charAt(j)) 
                    break;
                i++;
                j++;
            }
            return s.substring(0,i);
        }
        
    }
    
}
