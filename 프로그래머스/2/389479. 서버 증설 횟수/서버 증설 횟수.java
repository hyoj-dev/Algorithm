class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        
        int[] addedServer = new int[players.length];
        int activeServer = 0;
        
        for(int i = 0; i < players.length; i++) {
            if(i >= k) {
                activeServer -= addedServer[i - k];
            }
            
            int neededServer = players[i] / m;
            
            if(neededServer > activeServer) {
                int addServer = neededServer - activeServer;
                
                addedServer[i] = addServer;
                activeServer += addServer;
                
                answer += addServer;
            }
        }
        
        return answer;
    }
}