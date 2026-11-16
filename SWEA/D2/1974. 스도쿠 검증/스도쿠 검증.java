import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] board = new int[9][9];
        
        for(int test_case = 1; test_case <= T; test_case++)
		{
			for(int i = 0; i < 9; i++) {
            	StringTokenizer st = new StringTokenizer(br.readLine(), " ");

                for(int j = 0; j < 9; j++)	board[i][j] = Integer.parseInt(st.nextToken());
            }
            
            boolean flag = true;
            
            for(int i = 0; i < 9; i++) {
           		int sum = 0;
                for(int j = 0; j < 9; j++) sum += board[i][j];
                
                if(sum != 45) {
                    flag = false;
                    break;
                }
            }
            
            for(int i = 0; i < 9 && flag; i++) {
           		int sum = 0;
                for(int j = 0; j < 9; j++) sum += board[j][i];
                
                if(sum != 45) {
                    flag = false;
                    break;
                }
            }
            
            for(int x = 0; x <= 6 && flag; x+=3) {
                for(int y = 0; y <= 6 && flag; y+=3) {
                	int sum = 0;
                    
                    for(int i = x; i < x + 3; i++) {
                        for(int j = y; j < y + 3; j++) sum += board[i][j];
                	}
                    
                    if(sum != 45) {
                    	flag = false;
                        break;
                    }
                }
            }
            
			System.out.println("#" + test_case + " " + (flag ? 1 : 0));
		}
	}
}