class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        
        // 첫 번째 반복문: 배열의 행(row)을 순회
        for(int i = 0; i < board.length; i++) {
            // 두 번째 반복문: 배열의 열(column)을 순회
            for(int j = 0; j < board[i].length; j++) {
                if(i + j <= k) {
                    answer += board[i][j];
                }
            }
        }
        
        return answer;
    }
}