class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(s.length() > 1){
            int cntOne = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') {
                    answer[1]++; // 0의 개수
                }
                else {
                    cntOne++; // 1의 개수
                }
            }
            s = Integer.toBinaryString(cntOne); // 1의 개수를 2진법 전환
            answer[0]++; // 전환 횟수 저장
        }
        return answer;
    }
}