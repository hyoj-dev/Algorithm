#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr) 
{
    vector<int> answer;
    
    for(int x : arr) {
        if(answer.empty() || answer.back() != x) answer.push_back(x);
    }
    
    return answer;
}