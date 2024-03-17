class Solution {
    public String solution(String phone_number) {
        String answer = "";
        answer = "*".repeat(phone_number.length() - 4) 
            + phone_number.substring(phone_number.length() -4);
        return answer;
    }
}