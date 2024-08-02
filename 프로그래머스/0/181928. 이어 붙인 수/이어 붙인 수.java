class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        // 홀수와 짝수를 저장할 변수
        String odd = "";
        String even = "";
        
        // 홀수와 짝수를 문자열로 결합
        for(int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 != 0) {
                odd += Integer.toString(num_list[i]);
            }
            else {
                even += Integer.toString(num_list[i]);
            }
        }
        // 홀수와 짝수 문자열을 정수로 변환
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}