#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> answer;
    
    for(auto command : commands) {
        int i = command[0], j = command[1], k = command[2];
        
        vector<int> arr;
        
        for(int a = i - 1; a <= j - 1; a++) {
            arr.push_back(array[a]);
        }
        
        sort(arr.begin(), arr.end());

        answer.push_back(arr[k - 1]);
    }
    
    return answer;
}