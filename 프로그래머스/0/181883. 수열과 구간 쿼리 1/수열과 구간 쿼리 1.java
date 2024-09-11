class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0]; // 쿼리의 시작 인덱스
            int e = query[1]; // 쿼리의 끝 인덱스
            
            // s부터 e까지의 구간에 대해 arr[i]에 1을 더한다
            for (int i = s; i <= e; i++) {
                arr[i]++;
            }
        }
        
        // 업데이트가 끝난 arr를 반환
        return arr;
    }
}
