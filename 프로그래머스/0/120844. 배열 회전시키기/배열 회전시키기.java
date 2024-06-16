class Solution {
    public int[] solution(int[] numbers, String direction) {
        // answer배열 초기화
        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            // 오른쪽으로 회전
            for (int i = 0; i < numbers.length; i++) {
                answer[(i+1) % numbers.length] = numbers[i];
            }
        } 
        else if (direction.equals("left")) {
            // 왼쪽으로 회전
            for (int i = 0; i < numbers.length; i++) {
                answer[i] = numbers[(i+1) % numbers.length];
            }
        }
        return answer;
    }
}
