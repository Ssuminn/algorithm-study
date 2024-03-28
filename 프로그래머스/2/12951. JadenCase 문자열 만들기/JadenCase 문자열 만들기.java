class Solution {
    public String solution(String s) {
        String answer = "";
        // " "을 가준으로 문자열을 자르기
        String[] arr = s.split(" ");
        // 잘린 문자열을 순서대로 처리
        for(int i = 0; i < arr.length; i++) {
            String a = arr[i];
            // 문자열의 길이가 공백이면 " "추가
            if(a.length() == 0) {
                answer += " ";
            }
            // 문자가 존재한다면 
            else{
                // 0번째(첫 문자)는 대문자로 변환
                answer += a.substring(0,1).toUpperCase();
                // 1번째부터 마지막 문자까지는 소문자로 변환
                answer += a.substring(1,a.length()).toLowerCase();
                // 마지막에는 " "추가
                answer += " ";
            }

        }
        // 입력 받은 문자열의 맨마지막이 " "라면 answer 반환
        if(s.substring(s.length()-1, s.length()).equals(" ")) {
            return answer;
        }
        // 맨마지막의 " "제외하고 answer 반환
        return answer.substring(0, answer.length()-1);
    }
}