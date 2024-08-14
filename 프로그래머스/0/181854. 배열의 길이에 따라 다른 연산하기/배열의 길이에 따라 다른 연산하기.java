class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        if(arr.length % 2 != 0) {
            for(int i = 0; i < arr.length; i+=2) {
                answer[i] = arr[i] + n;
            }
        }
        else {
            for(int i = 1; i < arr.length; i+=2) {
                answer[i] = arr[i] + n;
            }
        }
        
        return answer;
    }
}