import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] arr = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            .toArray(String[]::new);
        
        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));
        
        if(arr[0].equals("0")) return "0";
        
        for(String s : arr) {
            answer += s;
        }
        
        return answer;
    }
}