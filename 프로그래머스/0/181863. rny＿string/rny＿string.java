class Solution {
    public String solution(String rny_string) {
        String answer = "";
        // replace -> 문자 ' ', 문자열 " "
        answer = rny_string.replace("m","rn");
        
        return answer;
    }
}