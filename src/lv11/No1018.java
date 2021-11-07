package lv11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1018 {
	
	static boolean[][] board;
	static int min=64;
	
	static void find(int a, int b) {
		int x = a+8;
		int y = b+8;
		Boolean color = board[a][b];
		
		int cnt=0;
		for(int i=a;i<x;i++) {
			for(int j=b;j<y;j++) {
				if(board[i][j] != color)
					cnt++;
				
				color = (!color);
			}
			color = (!color);
		}
		cnt = Math.min(cnt, 64-cnt);
		min = Math.min(min, cnt);
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		board = new boolean[n][m];
		
		for(int i=0;i<n;i++) {
			String str = br.readLine();
			for(int j=0;j<m;j++) {
				if(str.charAt(j)=='W')
					board[i][j] = true;
				else
					board[i][j] = false;
			}
		}
		
		for(int i=0;i<n-7;i++) {
			for(int j=0;j<m-7;j++) {
				find(i,j);
			}			
		}
		System.out.println(min);
	}

}
