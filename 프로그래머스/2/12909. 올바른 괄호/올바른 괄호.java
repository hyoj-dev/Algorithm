import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] charArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        
        //일단 넣어. 넣는데 peek이 만약 ( 인데 c = ( ? 그냥 넣어. c = )? pop
        
        for(char c : charArr){
            if (c == '('){
                stack.push(c);
            } else {
                if (stack.isEmpty()) stack.push(c);
                else if (stack.peek() == '(') stack.pop();
                else stack.push(c);
            }
        }
        
        if (!stack.isEmpty()) answer = false; 
        

        return answer;
    }
}