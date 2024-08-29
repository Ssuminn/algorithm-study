class Solution {
    public int solution(String binomial) {
        // binomial을 공백을 기준으로 분리하여 a, op, b로 나눔
        String[] parts = binomial.split(" ");
        int a = Integer.parseInt(parts[0]);
        String op = parts[1];
        int b = Integer.parseInt(parts[2]);
        
        // 연산자에 따른 계산
        int result = 0;
        
        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
        }
        
        // 계산 결과 반환
        return result;
    }
}