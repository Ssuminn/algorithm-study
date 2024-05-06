import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        String result = "";
        if (A == 1) {
            if (B % 2 == 0) result = "B";
            else if (B % 2 == 1) result = "A";
        } 
        else if (A == 2) {
            if (B % 3 == 1) result = "A";
            else if (B % 3 == 0) result = "B";
        } 
        else if (A == 3) {
            if (B % 2 == 1) result = "B";
            else if (B % 2 == 0) result = "A";
        }
        System.out.println(result);
    }
}
