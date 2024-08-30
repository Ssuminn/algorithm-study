import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        // 문자열을 문자 배열로 분할
        String [] arr = a.split("");
        
        // 각 문자를 한 줄씩 출력
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
    }
}