#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

int solution(vector<int> priorities, int location) {
    int answer = 0;
    deque<pair<int, int>> dq;
    priority_queue<int> pq;
    
    for(int i = 0; i < priorities.size(); i++) {
        dq.push_back({priorities[i], i});
        pq.push(priorities[i]);
    }
    
    while(!dq.empty()) {
        auto current = dq.front();
        dq.pop_front();
        
        if(pq.top() == current.first) {
            pq.pop();
            answer++; 
            
            if(location == current.second) {
                return answer;
            }
        } else dq.push_back(current);
    }
    
    return answer;
}