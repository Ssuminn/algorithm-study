class Solution {
    public String solution(String n_str) {
        // 문자열에서 가장 왼쪽에 있는 0들을 제거
        return n_str.replaceFirst("^0+", "");
    }
}