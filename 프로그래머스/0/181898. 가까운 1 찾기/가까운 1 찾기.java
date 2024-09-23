class Solution {
    public int solution(int[] arr, int idx) {
        // idx 이후의 배열 요소 중에서 1을 찾아서 그 인덱스를 반환
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i; // 1을 찾으면 해당 인덱스를 반환
            }
        }
        // 1을 찾지 못하면 -1 반환
        return -1;
    }
}
