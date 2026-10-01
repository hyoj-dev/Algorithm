import java.util.*;

class Solution {
    int[] left = {3, 0}, right = {3, 2};
    
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        
        
        for(int num : numbers) {
            int[] nowPos = toPos(num);
            
            if(num == 1 || num == 4 || num == 7) {
                changePos('L', nowPos);
                answer.append("L");
            } else if (num == 3 || num == 6 || num == 9) {
                changePos('R', nowPos);
                answer.append("R");
            } else {
                int leftDist = calcDist(left, nowPos);
                int rightDist = calcDist(right, nowPos);
                
                if(leftDist < rightDist) {
                    changePos('L', nowPos);
                    answer.append("L");
                } else if(leftDist > rightDist) {
                    changePos('R', nowPos);
                    answer.append("R");
                } else {
                    if(hand.equals("left")) {
                        changePos('L', nowPos);
                        answer.append("L");
                    } else {
                        changePos('R', nowPos);
                        answer.append("R");
                    }
                }
            }
        }
        
        return answer.toString();
    }

    public int calcDist(int[] whichHand, int[] nowPos) {
        return Math.abs(nowPos[0] - whichHand[0]) + Math.abs(nowPos[1] - whichHand[1]);
    }
    
    public int[] toPos(int n) {
        if(n == 0) return new int[] {3, 1};
        
        return new int[] {
            (n - 1) / 3, (n - 1) % 3
        };
    }
    
    public void changePos(char flag, int[] nowPos) {
        if(flag == 'L') {
            left[0] = nowPos[0];
            left[1] = nowPos[1];
        } else {
            right[0] = nowPos[0];
            right[1] = nowPos[1];
        }
    }
}