#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(long long n) {
    vector<int> answer;
    
    string numToString = to_string(n);
    
    reverse(numToString.begin(), numToString.end());
    
    for(auto c : numToString) {
        answer.push_back(c - '0');
    }
    
    return answer;
}