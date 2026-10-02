import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int changeCnt = 0, hitCnt = 0;
        
        for(int i = 0; i < lottos.length; i++) {
            int lottoNum = lottos[i];
            
            if(lottoNum == 0) {
                changeCnt++;
                continue;
            }
            
            if(searchNum(lottoNum, win_nums)) hitCnt++;
        }
        
        int[] answer = {
            convertRank(changeCnt + hitCnt),
            convertRank(hitCnt)
        };
        
        return answer;
    }
    
    private boolean searchNum(int lottoNum, int[] winNums) {
        for(int i = 0; i < winNums.length; i++) {
            if(lottoNum == winNums[i]) return true;
        }
        
        return false;
    }
    
    private int convertRank(int totalHit) {
        int rank = 6;
        
        if(totalHit == 6) rank = 1;
        else if(totalHit == 5) rank = 2;
        else if(totalHit == 4) rank = 3;
        else if(totalHit == 3) rank = 4;
        else if(totalHit == 2) rank = 5;
        
        return rank;
    }
}