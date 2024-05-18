import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
            int a = sc.nextInt(); // 총 인원 입력
            int b = sc.nextInt(); // 제출한 인원 입력
            int[] arr = new int[a + 1]; // / 총 인원 수 크기의 배열 선언 (1번 인덱스부터 사용)
            
            for (int i = 0; i < b; i++) { // 제출한 인원 번호를 입력받아 배열에 표시
                int num = sc.nextInt(); // 제출한 인원 번호 입력받기
                arr[num] = 1; // 해당 번호 인덱스를 1로 설정하여 제출했음을 표시
            }
            
            System.out.print("#" + test_case + " ");
            for (int i = 1; i <= a; i++) { // 제출하지 않은 인원을 찾음
                if (arr[i] == 0) // 제출하지 않은 인원을 찾음
                    System.out.print(i + " ");
            }
            System.out.println();
		}
	}
}