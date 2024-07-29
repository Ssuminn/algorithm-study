class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mux = 1;
        // 리스트의 길이가 10보다 큰 경우
        if(num_list.length > 10) {
            // 리스트 원소의 합
            for(int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
            return answer;
        }
        
        // 리스트의 길이가 10이하 인경우
        else{
            // 리스트 원소의 곱
            for(int i = 0; i < num_list.length; i++) {
                mux *= num_list[i];
            }
            return mux;
        }
        
    }
}