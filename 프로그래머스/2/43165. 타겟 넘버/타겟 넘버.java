import java.util.*;

class Solution {
    int[] arr;
    int answer;
    int target;
    
    public void dfs(int index, int sum) {
        //1. 종료 조건
        if(index == arr.length){
            if(sum == target) {
                answer++;    
            }
            return;
        }
        
        //2. 동작
        dfs(index + 1, sum + arr[index]);
        dfs(index + 1, sum - arr[index]);
    }
    
    
    public int solution(int[] numbers, int target) {
        this.arr = numbers;
        this.target = target;
        
        dfs(0,0);
        
        return answer;
    }
}