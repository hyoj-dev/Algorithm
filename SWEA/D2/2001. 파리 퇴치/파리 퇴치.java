import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[][] arr = new int[N][N];
            
            for(int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                
            	for(int j = 0; j < N; j++) arr[i][j] = Integer.parseInt(st.nextToken());
            }
            
            int max = 0;
            
            for(int i = 0; i <= N - M; i++) {
            	for(int j = 0; j <= N - M; j++) {
                    
                    int sum = 0;
                    
					for(int x = i; x < i + M; x++) {
                    	for(int y = j; y < j + M; y++) {
                        	sum += arr[x][y];
                        }
                    }
                    max = Math.max(max, sum);
                }
            }
            System.out.println("#" + test_case + " " + max);
            
            
		}
	}
}