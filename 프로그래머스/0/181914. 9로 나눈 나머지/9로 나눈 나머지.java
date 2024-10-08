class Solution {
    public int solution(String number) {
        int answer = 0;
        
        // 문자열의 각 자릿수의 합
        for (int i = 0; i < number.length(); i++) {
            // - '0'을 통해 문자를 숫자로 변환
            answer += number.charAt(i) - '0';
        }
        
        // 합을 9로 나눈 나머지를 반환
        return answer % 9;
    }
}