import java.util.*;

class Solution {
    HashMap<Character, Integer> scoreMap = new HashMap<>();
    
    private void defineSurvey(String survey, int choice) {
        char disagree = survey.charAt(0), agree = survey.charAt(1);
        
        if(choice == 1) scoreMap.put(disagree, scoreMap.getOrDefault(disagree, 0) + 3);
        else if(choice == 2) scoreMap.put(disagree, scoreMap.getOrDefault(disagree, 0) + 2);
        else if(choice == 3) scoreMap.put(disagree, scoreMap.getOrDefault(disagree, 0) + 1);
        else if(choice == 5) scoreMap.put(agree, scoreMap.getOrDefault(agree, 0) + 1);
        else if(choice == 6) scoreMap.put(agree, scoreMap.getOrDefault(agree, 0) + 2);
        else if(choice == 7) scoreMap.put(agree, scoreMap.getOrDefault(agree, 0) + 3);
    }
    
    public String solution(String[] survey, int[] choices) {
        
        for(int i = 0; i < survey.length; i++) {
            defineSurvey(survey[i], choices[i]);
        }
        
        StringBuilder answer = new StringBuilder();
        
        answer.append(
            scoreMap.getOrDefault('R', 0) >= scoreMap.getOrDefault('T', 0) ? "R" : "T"
        );
        answer.append(
            scoreMap.getOrDefault('C', 0) >= scoreMap.getOrDefault('F', 0) ? "C" : "F"
        );
        answer.append(
            scoreMap.getOrDefault('J', 0) >= scoreMap.getOrDefault('M', 0) ? "J" : "M"
        );
        answer.append(
            scoreMap.getOrDefault('A', 0) >= scoreMap.getOrDefault('N', 0) ? "A":"N"
        );
        
        return answer.toString();
    }
}