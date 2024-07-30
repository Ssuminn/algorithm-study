class Solution {
    public int[] solution(int[] num_list, int n) {
        // 배열의 크기 계산
        int size = (num_list.length + n - 1) / n;
        int[] answer = new int[size];
        
        for(int i = 0; i < size; i++) {
            answer[i] = num_list[i * n];
        }
        
        return answer;
    }
}