import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 1;
        
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) stack.push(c);
            else {
                if (stack.peek() == c) stack.pop();
                else stack.push(c);    
            }
        }
        
        if(!stack.isEmpty()) answer = 0;
        
        return answer;
    }
}