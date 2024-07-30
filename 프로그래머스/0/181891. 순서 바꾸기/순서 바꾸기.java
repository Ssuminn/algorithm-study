class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = num_list.length;
        int[] answer = new int[size];
        
        for(int i = 0; i < size; i++) {
            //  n만큼 이동한 후, 순환 배열 (베열이 왼쪽으로 n만큼씩 이동)
            answer[i] = num_list[(i + n) % size];
        }
        
        return answer;
    }
}