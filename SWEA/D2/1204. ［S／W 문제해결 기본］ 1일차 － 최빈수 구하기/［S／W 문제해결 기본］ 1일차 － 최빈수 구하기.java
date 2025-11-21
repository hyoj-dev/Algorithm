import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.format.ResolverStyle;
import java.util.*;

public class Solution {	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
        	int N = Integer.parseInt(br.readLine());
        	HashMap<Integer, Integer> map = new HashMap<>();
        
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	for(int i = 0; i < 1000; i++) {
        		int key = Integer.parseInt(st.nextToken());
        		map.put(key, map.getOrDefault(key, 0)+1);
        	}
        	
        	ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        	 
        	Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
				@Override
				public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
					int v1 = o1.getValue();
					int v2 = o2.getValue();
					if(v2-v1 != 0) return v2-v1;
					
					return o2.getKey() - o1.getKey();
				}
			});
			
        	int answer  = list.get(0).getKey();

        	sb.append("#").append(test_case).append(" ").append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
