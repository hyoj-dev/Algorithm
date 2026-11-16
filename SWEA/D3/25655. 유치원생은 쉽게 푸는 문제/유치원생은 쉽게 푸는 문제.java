import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int X = Integer.parseInt(br.readLine());
            
			if(X == 1) sb.append(0);
            else if(X % 2 == 0) {
            	for(int i = 0; i < X / 2; i++) sb.append(8);
            } else {
            	sb.append(4);
                
                for(int i = 0; i < (X - 1) / 2; i++) sb.append(8);
            }

            System.out.println(sb.toString());
            sb.setLength(0);
		}
	}
}