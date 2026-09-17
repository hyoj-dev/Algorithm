#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

vector<int> solution(vector<int> prices) {
    vector<int> answer(prices.size());
    stack<int> st; 
    
    for(int i = 0; i < prices.size(); i++) {
        while(!st.empty() && prices[st.top()] > prices[i]) {
            int idx = st.top();
            st.pop();
            
            answer[idx] = i - idx;
        }
        
        st.push(i);
    }
    
    while(!st.empty()) {
        int idx = st.top();
        st.pop();
        
        answer[idx] = prices.size() - 1 - idx;
    }
    
    return answer;
}