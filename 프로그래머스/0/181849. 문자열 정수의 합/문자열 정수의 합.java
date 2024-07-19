class Solution {
    public int solution(String num_str) {
        int answer =0;
        
        for (int i = 0; i < num_str.length(); i++) {
            int a = Integer.parseInt(num_str.substring(i, i+1));
            
            answer += a;
        }
        
        return answer;
    }
}