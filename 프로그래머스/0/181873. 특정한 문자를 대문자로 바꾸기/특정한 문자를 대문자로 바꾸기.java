class Solution {
    public String solution(String my_string, String alp) {
        // replace를 사용하여 교체, 
        // toUpperCase로 대문자로 교체
        String answer = my_string.replace(alp, alp.toUpperCase());

        return answer;
    }
}