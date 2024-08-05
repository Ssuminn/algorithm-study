class Solution {
    public int solution(int a, int b) {
        int answer = 2 * a * b;
        // 두 정수를 문자열 형태로 -> 문자열에서 정수 형태로 
        int answer1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));

        if(answer > answer1) {
            return answer;
        }
        else {
            return answer1;
        }
        
    }
}