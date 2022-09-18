//Solution for question https://leetcode.com/problems/length-of-last-word/
package java;

public class LengthOfLastWord {
    class Solution {
        public int lengthOfLastWord(String s) {
            if(s.length()==1)
                return 1;
            String a="";
            for(int i=s.length()-1;i>=0;i--) {
                if(s.charAt(i)!=' ')
                  a+=s.charAt(i);
                if(s.charAt(i)!= ' ' && i==0)
                {
                    break;
                }
            
                if(s.charAt(i)!=' ' &&s.charAt(i-1)==' ')
                   {
                    
                    break;
                }
                
            }
           
            return a.length();
        }
    }
    //Better solution 100% rate
    public int lengthOfLastWord(String s) {
        if(s.length()==1)
            return 1;
        int lastLength=0;
        for(int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i)==' ' && lastLength>0)
                return lastLength;
            if(s.charAt(i)!=' ')
              lastLength++;
           
        }
       
        return lastLength;
    }
    
}
