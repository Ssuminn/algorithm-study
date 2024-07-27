class Solution {
    public String solution(String myString) {
        // 모든 문자를 소문자로 변환
        String str = myString.toLowerCase();
        // 문자열에서 특정 문자를 다른 문자로 대체
        String answer = str.replace('a', 'A');
        
        return answer;
    }
}