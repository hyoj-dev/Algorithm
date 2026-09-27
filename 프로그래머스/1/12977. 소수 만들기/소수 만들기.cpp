#include <vector>
#include <iostream>
using namespace std;

int answer = 0;

bool isPrime(int n) {
    if(n < 2) return false;
    
    for(int i = 2; i * i <= n; i++) {
        if(n % i == 0) return false;
    }
    
    return true;
}

void dfs(vector<int>& nums, int sum, int level, int start) {
    if(level == 3) {
        if(isPrime(sum)) answer++;
        return;
    }
    for(int i = start; i < nums.size(); i++) {
        dfs(nums, sum + nums[i], level + 1, i + 1);
    }
}

int solution(vector<int> nums) {

    dfs(nums, 0, 0, 0);
    
    return answer;
}