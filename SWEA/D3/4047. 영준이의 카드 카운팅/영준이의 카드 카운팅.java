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
			String str = br.readLine();
			
			int[] cards = new int[4];
			Arrays.fill(cards, 13);
			
			ArrayList<boolean[]> checkList = new ArrayList<>();
			
			for(int i = 0 ; i < 4 ; i++) {
				checkList.add(new boolean[14]);
				Arrays.fill(checkList.get(i), false);
			}
			
			boolean flag = true;

			for(int i = 0 ; i < str.length(); i+=3) {
				char deck = str.charAt(i);
				int deckNum = Integer.parseInt(String.valueOf(str.charAt(i+1)) + String.valueOf(str.charAt(i+2)));
				
				if(deck=='S') {
					boolean[] check = checkList.get(0);
					if(!check[deckNum]) {
						cards[0] -= 1;
						check[deckNum] = true;
					} else {
						flag = false;
						break;
					}
				} else if(deck=='D') {
					boolean[] check = checkList.get(1);
					if(!check[deckNum]) {
						cards[1] -= 1;
						check[deckNum] = true;
					} else {
						flag = false;
						break;
					}
				} else if(deck=='H') {
					boolean[] check = checkList.get(2);
					if(!check[deckNum]) {
						cards[2] -= 1;
						check[deckNum] = true;
					} else {
						flag = false;
						break;
					}
				} else if(deck=='C') {
					boolean[] check = checkList.get(3);
					if(!check[deckNum]) {
						cards[3] -= 1;
						check[deckNum] = true;
					} else {
						flag = false;
						break;
					}
				}	
			}
			
			sb.append("#").append(test_case).append(" ");
			
			if(flag) {
				for (int c : cards) sb.append(c).append(" ");
				sb.append("\n");				
			} else sb.append("ERROR").append("\n");
			
		}
		System.out.print(sb);
	}
}