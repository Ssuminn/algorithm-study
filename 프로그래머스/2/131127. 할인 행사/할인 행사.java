class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        for (int i = 0; i <= discount.length - 10; i++) { // 연속된 10일을 검사하기 위해 discount 배열의 범위를 설정
            int cntday = 0;
            for (int j = 0; j < want.length; j++) {
                int cnt = 0;
                for (int k = i; k < i + 10; k++) { // 연속된 10일 동안의 할인 정보를 확인
                    if (k >= discount.length) break; // 배열의 범위를 벗어나는 경우 종료
                    if (discount[k].equals(want[j])) cnt++; // 할인 정보가 일치하는 경우 cnt 증가
                }
                if (cnt >= number[j]) cntday++; // 할인 횟수가 목표한 횟수 이상인 경우 cntday 증가
            }
            if (cntday == want.length) answer++; // 모든 상품에 대해 연속된 10일 동안의 할인을 받은 경우 answer 증가
        }
        
        return answer;
    }
}
