import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		int n = 5; // 행과 열의 수
        char[][] pattern = new char[n][n]; // n x n 크기의 2차원 배열을 생성

        // 패턴 초기화
        for(int i = 0; i < 5; i++){
        	for(int j = 0; j < 5; j++){
            	pattern[i][j] = '+';
            }
        }
        // 대각선에 '#' 추가
       for(int i = 0; i < 5; i++){
            pattern[i][i] = '#';
        }
        // 패턴 출력
        for(int i = 0; i < 5; i++){
        	for(int j = 0; j < 5; j++){
				System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
	}
}