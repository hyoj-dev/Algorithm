import java.util.*;

class Solution {
    int solution(int[][] land) {
        int len = land.length;
        
        int[][] dp = new int[len][4];
        
        for(int i = 0; i < 4; i++) {
            dp[0][i] = land[0][i];
        }
        
        for(int row = 1; row < len; row++) {
            for(int col = 0; col < 4; col++) {
                int maxPrev = 0;
                
                for(int prevCol = 0; prevCol < 4; prevCol++) {
                    if(col == prevCol) continue;
                    
                    maxPrev = Math.max(maxPrev, dp[row - 1][prevCol]);
                }
                
                dp[row][col] = land[row][col] + maxPrev;
            }
        }
        int answer = 0;
        
        for(int i = 0; i < 4; i++) {
            answer = Math.max(answer, dp[len - 1][i]);
        }

        return answer;
    }
}