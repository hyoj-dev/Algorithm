#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    
    vector<int> supo1 {1,2,3,4,5};
    vector<int> supo2 {2,1,2,3,2,4,2,5};
    vector<int> supo3 {3,3,1,1,2,2,4,4,5,5};
    
    int cnt1 = 0, cnt2 = 0, cnt3 = 0;
    
    for(int i = 0; i < answers.size(); i++) {
        if(answers[i] == supo1[i % supo1.size()]) cnt1++;
        if(answers[i] == supo2[i % supo2.size()]) cnt2++;
        if(answers[i] == supo3[i % supo3.size()]) cnt3++;
    }
    
    int maxCnt = max({cnt1, cnt2, cnt3});
    
    if(maxCnt == cnt1) answer.push_back(1);
    if(maxCnt == cnt2) answer.push_back(2);
    if(maxCnt == cnt3) answer.push_back(3);
    
    return answer;
}   