class Solution {
    public int[] solution(String myString) {
        // "x"를 기준으로 문자열을 분할하여 문자열 배열을 생성
        // 문자열의 끝에 있는 빈 문자열도 배열에 포함
        String[] str = myString.split("x" , -1);
        // 분할된 문자열 배열의 길이만큼 정수 배열을 생성
        int[] answer = new int[str.length];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = str[i].length();
        }
        
        return answer;
    }
}