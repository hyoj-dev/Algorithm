import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Solution {
	static int answer = 0;
	
	public static void palin(char[] arr, int pLen) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i <= arr.length-pLen ; i++) {
			for(int j = i ;j < i+ pLen ; j++) {
				sb.append(arr[j]);
			}
			String str = sb.toString();
			String reversed = new StringBuilder(str).reverse().toString();
			if (str.equals(reversed)) answer++;
			sb.setLength(0);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = 10;
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int pLen = Integer.parseInt(br.readLine());
			char[][] board = new char[8][8];
			
			for(int i = 0 ; i < 8 ; i++) {
				board[i] = br.readLine().toCharArray();
			}
			
			answer = 0;
			//가로
			for(int i = 0 ; i < 8;i++) {
				palin(board[i], pLen);
			}
			//세로
			for(int i = 0 ; i < 8; i++) {
				char[] vertical = new char[8];
				for(int j = 0; j < 8 ; j++) {
					vertical[j] = board[j][i];
				}
				palin(vertical, pLen);
			}
			
			
			sb.append("#").append(test_case).append(" ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}