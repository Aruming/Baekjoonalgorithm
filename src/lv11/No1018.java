package lv11;

import java.util.Scanner;

public class No1018 {
	static String[][] board;
	static int min=64;
	static void find(int i, int j) {
		int x = i+8;
		int y = j+8;
		String color = board[i][j];
		
		int cnt=0;
		for(int a=0;a<x;a++) {
			for(int b=0;b<y;b++) {
				if(board[i][j] != color)
					cnt++;
				if(color.equals("W"))
					color = "B";
				else if(color.equals("B"))
					color="W";
			}
			if(color.equals("W"))
				color = "B";
			else if(color.equals("B"))
				color="W";
		}
		cnt = Math.min(cnt, 64-cnt);
		min = Math.min(min, cnt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();		
		board = new String[n][m];
		for(int i=0;i<n;i++) {
			String str = sc.next();
			board[i] = str.split("");
		}
		
		for(int i=0;i<n-7;i++) {
			for(int j=0;j<m-7;j++) {
				find(i,j);
			}			
		}
		System.out.println(min);
	}

}
