#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> progresses, vector<int> speeds) {
    vector<int> answer;
    
    vector<int> worked;
    for(int i = 0; i < speeds.size(); i++) {
        int progress = progresses[i], speed = speeds[i];
        
        int finishedPeriod = (100 - progresses[i]) / speed;
        if((100 - progress) % speed != 0) finishedPeriod++;
        
        worked.push_back(finishedPeriod);
    }
    
    int cnt = 1;
    int maxDay = worked[0];
    
    for(int i = 1; i < worked.size(); i++) {
        int nowPeriod = worked[i];
        
        if (maxDay >= nowPeriod) cnt++;
        else {
            maxDay = nowPeriod;
            answer.push_back(cnt);
            cnt = 1;
        }
    }
    
    answer.push_back(cnt);
    
    return answer;
}