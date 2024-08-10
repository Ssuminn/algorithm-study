class Solution {
    public int solution(int[] num_list, int n) {
        // 배열의 모든 요소를 순회
        for(int i = 0; i < num_list.length; i++) {
            // 현재 요소가 n과 같다면 1을 반환
            if (num_list[i] == n) {
                return 1;
            }
        }
        // n을 찾지 못하면 0을 반환
        return 0;
    }
}