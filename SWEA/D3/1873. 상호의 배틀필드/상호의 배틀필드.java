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
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			char[][] map = new char[H][W];
			
			int startX = 0, startY = 0;
			
			for(int i = 0; i < H;i++) {
				String line = br.readLine();
				for(int j = 0 ; j < W ;j++) {
					map[i][j] = line.charAt(j);
					if (map[i][j] == '<' || map[i][j] == '>' || map[i][j] == '^' || map[i][j] == 'v') {
						startX = i; 
						startY = j;
					}
				}
			}
			int N = Integer.parseInt(br.readLine());
			String command = br.readLine();
			int nx, ny;
			for(int i = 0; i < N; i++) {
				char c = command.charAt(i);
				
				switch(c) {
					case 'U':
						map[startX][startY] = '^';
						nx = startX - 1;
						ny = startY;
						if(nx >= 0 && nx < H && ny>=0 && ny<W && map[nx][ny] == '.') {
							map[nx][ny] = '^';
							map[startX][startY] = '.';
							startX -= 1;
						}
						break;
					case 'D':
						map[startX][startY] = 'v';
						nx = startX + 1;
						ny = startY;
						if(nx >= 0 && nx < H && ny>=0 && ny<W && map[nx][ny] == '.') {
							map[nx][ny] = 'v';
							map[startX][startY] = '.';
							startX += 1;
						}
						break;
					case 'L':
						map[startX][startY] = '<';
						nx = startX;
						ny = startY - 1;
						if(nx >= 0 && nx < H && ny>=0 && ny<W && map[nx][ny] == '.') {
							map[nx][ny] = '<';
							map[startX][startY] = '.';
							startY -= 1;
						}
						break;
					case 'R':
						map[startX][startY] = '>';
						nx = startX;
						ny = startY + 1;
						if(nx >= 0 && nx < H && ny>=0 && ny<W && map[nx][ny] == '.') {
							map[nx][ny] = '>';
							map[startX][startY] = '.';
							startY += 1;
						}
						break;
					case 'S':
						char direction = map[startX][startY];
						int dx = 0, dy = 0;
						if(direction == '^') {
							dx = -1; 
							dy = 0;
						} else if(direction == 'v') {
							dx = 1;
							dy = 0;
						} else if(direction == '<') {
							dx = 0;
							dy = -1;
						} else if(direction == '>') {
							dx = 0;
							dy = 1;
						}
						
						int bx = startX + dx, by = startY + dy;
						while(bx >= 0 && bx < H && by >= 0 && by < W) {
							if(map[bx][by] == '#') break;
							if(map[bx][by] == '*') {
								map[bx][by] = '.';
								break;
							}
							bx += dx;
							by += dy;
						}
						break;
				}
			}
			
			sb.append("#").append(test_case).append(" ");
			for (char[] strings : map) {
				sb.append(strings).append("\n");
			}
		}
		System.out.print(sb);
	}
}