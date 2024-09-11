class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while(num != 1) {
            // num이 짝수라면
            if (num % 2 == 0) {
                num /= 2;
            }
            // num이 홀수라면
            else {
                num = num * 3 + 1;
            }
            answer++;  // 반복할 때마다 작업 횟수를 증가
            
            // 작업 반복 500회 이상인 경우
            if(answer >= 500) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}