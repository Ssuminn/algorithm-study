class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            // 첫 번째로 나오는 음수의 인덱스를 return
            if(num_list[i] < 0) {
                answer = i;
                break;
            }
            
            // 음수 x
            else{
                answer = -1;
            }
        }
        
        return answer;
    }
}