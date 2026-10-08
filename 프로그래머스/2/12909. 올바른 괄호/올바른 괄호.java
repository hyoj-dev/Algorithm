import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Deque<Character> stack = new ArrayDeque<>();
        
        for(char c : s.toCharArray()) {
            if(c == '(') stack.push(c);
            else {
                if(stack.isEmpty()) stack.push(c);
                else if(stack.peek() == '(') stack.pop();
                else stack.push(c);
            }
        }
        
        if(!stack.isEmpty()) answer = false;
        
        return answer;
    }
}