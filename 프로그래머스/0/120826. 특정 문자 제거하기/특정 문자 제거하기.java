class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";

        answer = my_string.replace(letter, "");
        //replace->문자치환
        return answer;
    }
}