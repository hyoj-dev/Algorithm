import java.util.Scanner;

public class Solution {
	static int pow(int num, int p) {
		if(p==0) return 1;
		else return num * pow(num, p-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = 10;
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int tc = sc.nextInt();
			int num = sc.nextInt();
			int p = sc.nextInt();
			
			int answer = pow(num, p);
			System.out.println("#"+tc+" "+answer);
		}
	}
}
