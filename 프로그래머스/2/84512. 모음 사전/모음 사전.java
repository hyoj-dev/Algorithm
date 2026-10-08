import java.util.*;

class Solution {
    List<String> dict = new ArrayList<>();
    char[] vowels = {'A', 'E','I', 'O', 'U'};
    
    public void dfs(String current) {
        dict.add(current);
        
        if(current.length() == 5) return;
        
        for(char vowel : vowels) {
            dfs(current + vowel);
        }
    }
    
    public int solution(String word) {
        dfs("");
        
        return dict.indexOf(word);
    }
}