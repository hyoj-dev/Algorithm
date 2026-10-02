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
        for(int winNum : winNums) {
            if(winNum == lottoNum) return true;
        }
        
        return false;
    }
    
    private int convertRank(int totalHit) {
        if(totalHit < 2) return 6;
        
        return 7 - totalHit;
    }
}