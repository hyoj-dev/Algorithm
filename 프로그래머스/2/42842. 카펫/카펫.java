class Solution {
    public int[] solution(int brown, int yellow) {
        int x = 0, y = 0;
        
        for (int i = 1; i * i <= yellow; i++) {
            if (yellow % i == 0) {
                x = i;
                y = yellow / i;
                
                if (2 * (x + y) + 4 == brown) break;
            }
        }
        return new int[] {y + 2, x + 2};
    }
}

/*
노란색 가운데 배치하고 그 주변을 갈색이 덮는다
        

*/