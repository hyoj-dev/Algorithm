#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

int answer = 0;
bool visited[7];
set<int> made;

bool isPrime(int n){
    if(n < 2) return false;
    
    for(int i = 2; i * i <= n; i++) {
        if(n % i == 0) return false;
    }
    
    return true;
}

void dfs(string& numbers, string current) {
    if(!current.empty()) {
        int num = stoi(current);
        
        if(made.find(num) == made.end()) {
            made.insert(num);
            
            if(isPrime(num)) answer++;
        }
    }
    
    for(int i = 0; i< numbers.size(); i++) {
        if(!visited[i]) {
            visited[i] = true;
            dfs(numbers, current + numbers[i]);
            visited[i] = false;
        }
    }
}

int solution(string numbers) {
    dfs(numbers, "");
    
    return answer;
}
