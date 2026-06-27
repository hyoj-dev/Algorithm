import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        ArrayList<String> list = new ArrayList<>();
                
        for (String phoneNum : phone_book){
            list.add(phoneNum);
        }
        
        Collections.sort(list);
        
        for(int i = 0; i < list.size() - 1; i++) {
            String curr = list.get(i);
            String next = list.get(i+1);
            
            if(next.startsWith(curr)) return false;
        }

        return true;
    }
}