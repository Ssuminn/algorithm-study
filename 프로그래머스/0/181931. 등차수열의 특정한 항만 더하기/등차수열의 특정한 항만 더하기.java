class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        // 등차 수열 배열 선언
        int[] dif = new int[included.length];
        
        for(int i = 0; i < included.length; i++) {
            // 등차 수열 배열
            dif[i] = a + (d * i);
            
            // true일때 의 항의 합
            if(included[i] == true) {
                answer += dif[i];
            }
        }
        
        return answer;
    }
}