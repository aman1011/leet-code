// Solution to palindrome problem https://leetcode.com/problems/palindrome-number/
package java;

public class PalindromeSolution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int check=x;
        int value=0;
        while(x>0)
        {
            value=(value*10) + (x%10);
            x=x/10;
        }
        // System.out.println(value);
        return value==check;
    }
    
}
