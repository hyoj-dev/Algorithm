#include <string>
#include <vector>
#include <queue>

using namespace std;

long long solution(long long n) {
    string s = to_string(n);
    
    priority_queue<char> pq;
    
    for(char c : s) {
        pq.push(c);
    }
    
    string answer;
    
    while(!pq.empty()) {
        answer += pq.top();
        pq.pop();
    }
    
    return stol(answer);
}