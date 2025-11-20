import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {	
	static char[][] arr = new char[100][100];
	
	public static boolean isPalinRow(int r, int start, int len) {
		int left = start, right = start+len-1;
		
		while(left < right) {
			if(arr[r][left] != arr[r][right]) return false;
			left++;
			right--;
		}
		return true;
	}
	
	
	public static boolean isPalinCol(int c, int start, int len) {
		int left = start, right = start + len - 1;
		
		while(left < right) {
			if(arr[left][c] != arr[right][c]) return false;
			left++;
			right--;
		}
		return true;
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = 10;

        for (int test_case = 1; test_case <= T; test_case++) {
        	int tc = Integer.parseInt(br.readLine());
        	for(int i = 0 ; i < 100 ; i++) {
        		String line = br.readLine();
        		for(int j = 0 ; j < 100; j++) {
        			arr[i][j] = line.charAt(j);
        		}
        	}
        	
        	int answer = 0;
        	int rlen = 0, clen = 0;
        	for(int len = 100; len >= 1; len--) {
        		for(int r = 0; r < 100 ;r++) {
        			for(int start = 0; start+len <= 100 ; start++) {
        				if(isPalinRow(r, start, len)) {
        					rlen = Math.max(rlen, len);
        				}
        			}
        		}
        		
        		for(int c = 0; c < 100 ; c++) {
        			for(int start = 0; start+len <= 100; start++) {
        				if(isPalinCol(c, start, len)) {
        					clen = Math.max(clen, len);
        				}
        			}
        		}
        		answer = Math.max(rlen, clen);
        	}
        	sb.append("#").append(tc).append(" ").append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
