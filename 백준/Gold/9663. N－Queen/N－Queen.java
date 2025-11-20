import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {	
	public static int N, answer;
	public static int[] arr;
	
	public static void DFS(int L) {
		if(L==N) {
			answer++;
			return;
		}
		for(int i = 0; i < N ; i++) {
			arr[L] = i;
			if(isPossible(L)) DFS(L+1);
		}
	}
	
	public static boolean isPossible(int col) {
		for(int i = 0; i < col; i++) {
			if(arr[col] == arr[i])	return false;
			else if (Math.abs(col-i)==Math.abs(arr[col] - arr[i])) return false;
		}
		return true;
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        answer = 0;
        DFS(0);
      
        System.out.print(answer);
    }
}
