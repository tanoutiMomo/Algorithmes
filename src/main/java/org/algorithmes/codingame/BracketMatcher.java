package org.algorithmes.codingame;

import java.util.Stack;

public class BracketMatcher {

    public static boolean isParenthesisMatch(String str) {
        if (str == null)
            return true;

        Stack<Character> stack = new Stack<Character>();

        char c;
        for(int i=0; i < str.length(); i++) {
            c = str.charAt(i);
            if(c == '(')
                stack.push(c);
            else if(c == '[')
                stack.push(c);
            else if(c == ')')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            else if(c == ']')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '[')
                    stack.pop();
                else
                    return false;
        }
        return stack.empty();
    }
}
