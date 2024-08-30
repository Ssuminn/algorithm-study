import java.util.*;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        // 세 숫자의 합, 제곱, 세제곱 각 계산의 합
        int sum = a + b + c; // 합
        int squareSum = a * a + b * b + c * c; // 제곱
        int cubeSum = a * a * a + b * b * b + c * c * c; // 세제곱
        
        // 세 숫자가 모두 다른 경우
        if (a != b && b != c && a != c) {
            answer = sum;
        } 
        // 세 숫자가 모두 같은 경우
        else if (a == b && b == c) {
            answer = sum * squareSum * cubeSum;
        } 
        // 두 숫자가 같은 경우
        else {
            answer = sum * squareSum;
        }
        
        return answer;
    }
}