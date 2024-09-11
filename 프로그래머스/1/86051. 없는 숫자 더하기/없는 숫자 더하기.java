class Solution {
    public int solution(int[] numbers) {
        // 0~9까지 전체 합
        int answer = 45;
        
        // 전체에서 있는 숫자를 빼기 = 없는 숫자의 합
        for(int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }
        
        return answer;
    }
}