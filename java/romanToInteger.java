// Solution to the problem https://leetcode.com/problems/roman-to-integer/

package java;

class romanToInteger {
    public int romanToInt(String s) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()-1){
            if(s.charAt(i)=='I' && s.charAt(i+1)=='V')
            {count+=4;i=i+1;continue;}
                if(s.charAt(i)=='I' && s.charAt(i+1)=='X')
                {count+=9;i=i+1;continue;}
            if(s.charAt(i)=='X' && s.charAt(i+1)=='L')
            {count+=40;i=i+1;continue;}
            if(s.charAt(i)=='X' && s.charAt(i+1)=='C')
            {count+=90;i=i+1;continue;}
            if(s.charAt(i)=='C' && s.charAt(i+1)=='D')
            {count+=400;i=i+1;continue;}
            if(s.charAt(i)=='C' && s.charAt(i+1)=='M')
            {count+=900;i=i+1;continue;}
            }
            if(s.charAt(i)==('I'))
                count=count+1;
            if(s.charAt(i)=='V')
                count=count+5;
            if(s.charAt(i)=='X')
                count=count+10;
            if(s.charAt(i)=='L')
                count=count+50;
            if(s.charAt(i)=='C')
                count=count+100;
            if(s.charAt(i)=='D')
                count=count+500;
            if(s.charAt(i)=='M')
                count=count+1000;
            
        }
        return count;
        
    }
}