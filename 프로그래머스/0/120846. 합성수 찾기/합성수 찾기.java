class Solution {
    public int solution(int n) {
        int answer = 0;

        // 1부터 n까지 반복
        for(int i = 1; i <= n; i++) {
            // 약수 개수를 세는 변수, 매 숫자마다 초기화
            int compositeNum = 0;

            // 숫자 i의 약수 개수를 세기 위한 반복문
            for(int j = 1; j <= i; j++) {
                // i가 j로 나눠지면 약수
                if(i % j == 0) {  
                    compositeNum++;
                }
            }

            // 약수가 3개 이상이면 합성수
            if(compositeNum > 2) {
                answer++;
            }
        }
        
        // 합성수의 개수를 반환
        return answer;  
    }
}
