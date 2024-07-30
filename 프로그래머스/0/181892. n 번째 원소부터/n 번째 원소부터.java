class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = num_list.length - n + 1;
        int[] answer = new int[size];
        
        // n 번째 원소부터 마지막 원소까지
        for(int i = 0; i < size; i++) {
            answer[i] = num_list[i + n -1];
        }
        
        return answer;
    }
}