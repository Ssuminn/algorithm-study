class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            // 값이 50보다 크거나 같은 짝수
            if(arr[i] >= 50 && arr[i]%2 == 0) {
                answer[i] = arr[i]/2;
            }
            // 50보다 작은 홀수
            else if(arr[i] < 50 && arr[i]%2 != 0){
                answer[i] = arr[i]*2;
            }
            
            else{
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}