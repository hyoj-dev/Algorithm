import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int n = triangle.length;
        int[][] dp = new int[n][n];
        
        dp[0][0] = triangle[0][0];
        
        for(int row = 1; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                if(col == 0) {
                    dp[row][col] = 
                        dp[row - 1][0] + triangle[row][col];
                }
                else if(col == n) {
                    dp[row][col] = 
                        dp[row - 1][col - 1] + triangle[row][col];
                }
                else {
                    dp[row][col] =
                        Math.max(dp[row - 1][col - 1], dp[row - 1][col])
                        + triangle[row][col];
                }
            }
        }
        
        for (int value : dp[n-1]) {
            answer = Math.max(answer, value);
        }
        
        return answer;
    }
}