class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        
        // 두 문자열의 길이가 같다고 했으므로 반복문을 하나만 사용
        for (int i = 0; i < str1.length(); i++) {
            // str1의 문자 추가
            answer.append(str1.charAt(i));
            // str2의 문자 추가
            answer.append(str2.charAt(i));
        }
        
        // 완성된 문자열 반환
        return answer.toString();
    }
}
