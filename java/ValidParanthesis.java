// Solution to problem https://leetcode.com/problems/valid-parentheses/submissions/
package java;

public class ValidParanthesis {
    class Solution {
        String[] stack;
        int count = 0;

        public boolean isValid(String s) {
            if (s.length() == 1)
                return false;
            stack = new String[s.length()];

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                    push(String.valueOf(s.charAt(i)));

                } else if (s.charAt(i) == ')' && top1().equals("(")) {

                    pop();
                } else if (s.charAt(i) == ']' && top1().equals("[")) {
                    pop();
                } else if (s.charAt(i) == '}' && top1().equals("{")) {
                    pop();
                } else
                    return false;
            }

            return count == 0;

        }

        public void push(String s) {
            stack[count++] = s;

        }

        public void pop() {

            if (stack.length == 0)
                return;
            count--;

        }

        public String top1() {
            if (count > 0)
                return stack[count - 1];
            return "";

        }
    }

}
