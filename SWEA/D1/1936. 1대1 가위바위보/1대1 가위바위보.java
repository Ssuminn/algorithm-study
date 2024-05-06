import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
        int B = sc.nextInt();
        
        // A가 가위(1)를 냈을 때
        if (A == 1) {
            // B가 바위(2)를 냈을 때 B가 이김
            if (B == 2) {
                System.out.println("B");
            }
            // B가 보(3)를 냈을 때 A가 이김
            else {
                System.out.println("A");
            }
        }
        // A가 바위(2)를 냈을 때
        else if (A == 2) {
            // B가 가위(1)를 냈을 때 A가 이김
            if (B == 1) {
                System.out.println("A");
            }
            // B가 보(3)를 냈을 때 B가 이김
            else {
                System.out.println("B");
            }
        }
        // A가 보(3)를 냈을 때
        else {
            // B가 가위(1)를 냈을 때 B가 이김
            if (B == 1) {
                System.out.println("B");
            }
            // B가 바위(2)를 냈을 때 A가 이김
            else {
                System.out.println("A");
            }
        }
	}
}