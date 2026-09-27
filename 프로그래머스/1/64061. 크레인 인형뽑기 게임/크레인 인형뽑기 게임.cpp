#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

int solution(vector<vector<int>> board, vector<int> moves) {
    vector<stack<int>> dolls;
    stack<int> popDoll;
    
    int answer = 0;
    
    for(int i = 0; i < board.size(); i++) {
        dolls.push_back(stack<int>());
    }
    
    for(int i = board.size() - 1; i >= 0; i--) {
        for(int j = 0; j < board.size(); j++) {
            int doll = board[i][j];
            
            if(doll != 0) dolls[j].push(doll);
        }
    }
    
    for(int move : moves) {
        stack<int>& tmp = dolls[move - 1];
        
        if(tmp.empty()) continue;
        
        int doll = tmp.top();
        tmp.pop();
        
        if(!popDoll.empty() && popDoll.top() == doll) {
            answer += 2;
            popDoll.pop();
        } else {
            popDoll.push(doll);
        }
    }
    
    return answer;
}