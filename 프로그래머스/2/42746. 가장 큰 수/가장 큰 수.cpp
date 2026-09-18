#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

bool compare(string a, string b) {
    return a + b > b + a;
}

string solution(vector<int> numbers) {
    vector<string> arr;
    
    for(int num : numbers) arr.push_back(to_string(num));
    
    sort(arr.begin(), arr.end(), compare);
    
    if(arr[0] == "0") return "0";
    
    string answer = "";
    
    for(string strNum : arr) answer += strNum;
    
    return answer;
}