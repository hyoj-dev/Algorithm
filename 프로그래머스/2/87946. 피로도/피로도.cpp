#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

int answer = 0;
bool visited[8];

void dfs(int k, int count, vector<vector<int>>& dungeons) {
    answer = max(answer, count);
    
    for(int i = 0; i < dungeons.size(); i++) {
        if(!visited[i] && dungeons[i][0] <= k) {
            visited[i] = true;
            dfs(k - dungeons[i][1], count + 1, dungeons);
            visited[i] = false;
        }
    }
}

int solution(int k, vector<vector<int>> dungeons) {
    
    dfs(k, 0, dungeons);
    
    return answer;
}