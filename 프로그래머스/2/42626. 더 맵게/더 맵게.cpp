#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

int solution(vector<int> scoville, int K) {
    int answer = 0;
    priority_queue<int, vector<int>, greater<int>> pq;
    
    for(int sc : scoville) {
        pq.push(sc);
    }
    
    if(pq.empty() || pq.top() >= K) {
        return 0;
    }
    
    while(pq.top() < K) {
        
        if(pq.size() < 2){
            return -1;
        }
        
        int fst = pq.top();
        pq.pop();
        int snd = pq.top();
        pq.pop();
        
        pq.push(fst + snd * 2);
        
        answer++;
    }
    
    return answer;
}