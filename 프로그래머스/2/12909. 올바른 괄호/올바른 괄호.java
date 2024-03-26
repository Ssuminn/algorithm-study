import java.util.*;  


class Solution {
    boolean solution(String s) {
        boolean answer = true;
        //LIFO Stack
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='(') {
                stack.push('('); // 스택에 '('을 넣어줌
            }
            else if(s.charAt(i)==')'){
                if(stack.isEmpty()) { // ')'로 시작시 올바르지 않은 괄호
                    return false;
                }
                stack.pop(); // 스택에 들어있는'('을 빼줌
            }
        }

        return stack.isEmpty(); 
    }
}
