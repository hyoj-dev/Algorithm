import java.util.*;

class Node {
    public int idx; 
    public int priority;
    
    public Node(int idx, int priority) {
        this.idx = idx;
        this.priority = priority;
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Node> q = new ArrayDeque<>();
        PriorityQueue<Integer> pq = 
            new PriorityQueue<>(Collections.reverseOrder());
        
        int answer = 0;
        
        for(int i = 0; i < priorities.length; i++) {
            int priority = priorities[i];
            q.offer(new Node(i, priority));
            pq.offer(priority);
        }
        
        while(!q.isEmpty()) {
            Node now = q.poll();
            
            if(now.priority == pq.peek()) {
                
                pq.poll();
                answer++;
                
                if(now.idx == location) {
                    return answer;
                }

            } else {
                q.offer(now);
            }
        }
        
        return answer;
    }
}