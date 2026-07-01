import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = countOne(n), num = n + 1;
        
        
        while (true) {
            int numCnt = countOne(num++);
            
            if (cnt == numCnt) {
                answer = num;
                break;
            }
        }
        
        return answer - 1;
    }
    
    private static int countOne(int n) {
        String binary = Integer.toBinaryString(n);
        int cnt = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') cnt++;
        }
        
        return cnt;
    }
}