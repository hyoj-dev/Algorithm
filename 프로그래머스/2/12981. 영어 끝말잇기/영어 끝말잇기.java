import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int nPerson  = 0;
        int turn = 0;
        
        Set<String> ex = new HashSet<>();
        
        ex.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            
            if (!ex.contains(word) && check(words[i - 1], word)) ex.add(word);
            else {
                turn = i / n + 1;
                nPerson = i % n + 1;
                break;
            }
        }
        return new int[] {nPerson, turn};
    }
    
    private boolean check(String before, String next) {
        if (before.charAt(before.length()-1) != (next.charAt(0))) return false;
        else return true; 
    }
}