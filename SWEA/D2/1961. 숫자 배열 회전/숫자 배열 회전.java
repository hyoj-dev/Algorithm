import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
        	int N = Integer.parseInt(br.readLine());
        	int[][] arr = new int[N][N];
        	for(int i = 0 ; i < N ;i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        		for(int j = 0 ; j < N ;j++) {
        			arr[i][j] = Integer.parseInt(st.nextToken());
        		}
        	}
        	
        	int[][] arr90 = new int[N][N];
        	int[][] arr180 = new int[N][N];
        	int[][] arr270 = new int[N][N];
        	
        	ArrayList<Integer> tmp = new ArrayList<>();
        	for(int i = 0; i < N ;i++) {
        		for(int j = 0; j < N ;j++) {
        			tmp.add(arr[j][i]);
        		}
        		for(int j = 0; j < N ;j++) {
        			arr90[i][j] = tmp.get(N-j-1);
        		}
        		tmp.clear();
        	}
        	
        	for(int i = 0; i < N ;i++) {
        		for(int j = 0; j < N ;j++) {
        			tmp.add(arr90[j][i]);
        		}
        		for(int j = 0; j < N ;j++) {
        			arr180[i][j] = tmp.get(N-j-1);
        		}
        		tmp.clear();
        	}
        	
        	for(int i = 0; i < N ;i++) {
        		for(int j = 0; j < N ;j++) {
        			tmp.add(arr180[j][i]);
        		}
        		for(int j = 0; j < N ;j++) {
        			arr270[i][j] = tmp.get(N-j-1);
        		}
        		tmp.clear();
        	}

        	sb.append("#").append(test_case).append("\n");
        	
        	for(int i = 0 ; i < N ;i++) {
        		for(int j = 0; j < N ;j++) {
        			sb.append(arr90[i][j]);
        		}
        		sb.append(" ");
        		for(int j = 0; j < N ;j++) {
        			sb.append(arr180[i][j]);
        		}
        		sb.append(" ");
        		for(int j = 0; j < N ;j++) {
        			sb.append(arr270[i][j]);
        		}
        		sb.append("\n");
        	}
        }
        System.out.print(sb);
    }
}
