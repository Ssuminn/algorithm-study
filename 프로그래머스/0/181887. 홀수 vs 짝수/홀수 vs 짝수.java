class Solution {
    public int solution(int[] num_list) {
        int even = 0;
        int odd = 0;
        
        for(int i = 0; i < num_list.length; i+=2) {
            even += num_list[i];
        }
        for(int i = 1; i < num_list.length; i+=2) {
            odd += num_list[i];
        }
        
        // 삼항연산자
        return even > odd ? even : odd;

    }
}