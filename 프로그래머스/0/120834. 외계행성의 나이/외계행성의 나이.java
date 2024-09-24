class Solution {
    public String solution(int age) {
        StringBuilder result = new StringBuilder();
        String ageStr = String.valueOf(age);  // 나이를 문자열로 변환

        // 각 자리 숫자를 알파벳으로 변환
        for (int i = 0; i < ageStr.length(); i++) {
            char ch = ageStr.charAt(i);  // 각 자리 숫자를 가져옴
            result.append((char)(ch - '0' + 'a'));  // 숫자를 알파벳으로 변환하여 결과에 추가
        }

        return result.toString();  // 변환된 문자열을 반환
    }
}
