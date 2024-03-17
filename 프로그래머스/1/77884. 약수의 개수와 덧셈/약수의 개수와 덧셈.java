class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int btw = left; btw <= right; btw++) {
            int count = 0;
            for(int i = 1; i <= btw; i++) {
                if(btw%i == 0){
                    count++;
                }
            }
            if(count%2 == 0) {
                answer += btw;
            }
            else{
                answer -= btw;
            }
        }
        return answer;
    }
}