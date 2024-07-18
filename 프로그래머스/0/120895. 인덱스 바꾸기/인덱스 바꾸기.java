class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        // 문자열을 split으로 쪼개기
        String[] arr = my_string.split("");
        
        // num1, num2 값 받아서 교체
        String temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        
        // 쪼개져있는 문자열을 합쳐주기
        answer = String.join("",arr);
        return answer;
        
        // return String.join("",arr);
    }
}