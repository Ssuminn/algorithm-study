class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);
        int a1 = 0;
        int a2 = 0;

        if(answer == 0) {
            for(int i = 0; i < arr1.length; i++) {
                a1 += arr1[i];
                a2 += arr2[i];
            }
            answer = Integer.compare(a1, a2);
        }

        return answer;
    }
}