class Solution {
    public String[] solution(String[] strArr) {
        // 입력 배열의 길이로 새로운 배열을 생성
        String[] answer = new String[strArr.length];
        
        // 짝수 인덱스의 문자열을 소문자로 변환
        for(int i = 0; i < strArr.length; i+=2) {
            answer[i] = strArr[i].toLowerCase();
        }
        // 홀수 인덱스의 문자열을 대문자로 변환
        for(int i = 1; i < strArr.length; i+=2) {
            answer[i] = strArr[i].toUpperCase();
        }
        
        return answer;
    }
}