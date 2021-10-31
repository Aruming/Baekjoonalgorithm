package lv11;

import java.util.Scanner;

public class No1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		String[][] board = new String[n][m];
		for(int i=0;i<n;i++) {
			String str = sc.next();
			board[i] = str.split(""); 
		}
		
		int cnt = 0;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<m-1;j++) {
				if(board[i][j]==board[i+1][j] || board[i][j]==board[i][j+1])
					cnt++;
			}
		}
		System.out.println(cnt);
	}

}
