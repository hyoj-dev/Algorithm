import java.util.*;
import java.io.*;

class Solution
{
    private static int[][] rotate(int[][] arr) {
    	int N = arr.length;
        
        int[][] rotate = new int[N][N];
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
            	rotate[j][N - 1 - i] = arr[i][j];
            }
		}
        return rotate;
    }
    
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = Integer.parseInt(br.readLine());
            
            int[][] arr = new int[N][N];
            
            for(int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                
                for(int j = 0; j < N; j++) arr[i][j] = Integer.parseInt(st.nextToken());
            }
            
            int[][] arr90 = rotate(arr);
            int[][] arr180 = rotate(arr90);
            int[][] arr270 = rotate(arr180);
            
            StringBuilder sb = new StringBuilder();
            
            sb.append("#").append(test_case).append("\n");
            for(int i = 0; i < N; i++) {
            	for(int j = 0; j < N; j++) sb.append(arr90[i][j]);
                sb.append(" ");
                for(int j = 0; j < N; j++) sb.append(arr180[i][j]);
                sb.append(" ");
            	for(int j = 0; j < N; j++) sb.append(arr270[i][j]);
                sb.append("\n");
            }
            System.out.print(sb);
		}
	}
}