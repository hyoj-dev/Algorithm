import java.util.Scanner;

public class Solution {
	static int pow(int start, int num, int p) {
		if(p==0) return start/num;
		else return pow(start*num, num, p-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = 10;
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int tc = sc.nextInt();
			int num = sc.nextInt();
			int p = sc.nextInt();
			
			int answer = pow(num, num, p);
			System.out.println("#"+tc+" "+answer);
		}
	}
}
