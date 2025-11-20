import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {	
	static int N, answer;
	static int[] arr;
	
	static void DFS(int L) {
		if(L==N) {
			answer++;
			return;
		}
		for(int i = 0; i < N ; i++) {
			arr[L] = i;
			if(isPossible(L)) DFS(L+1);
		}
	}
	
	static boolean isPossible(int col) {
		for(int i = 0; i < col; i++) {
			if(arr[col] == arr[i])	return false;
			else if (Math.abs(col-i)==Math.abs(arr[col] - arr[i])) return false;
		}
		return true;
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
        	N = Integer.parseInt(br.readLine());
        	arr = new int[N];
        	answer = 0;
        	DFS(0);
        	
        	sb.append("#").append(test_case).append(" ").append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
