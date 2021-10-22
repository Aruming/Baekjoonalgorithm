package lv10;

import java.util.Scanner;

public class No2447 {
	
	private static char[][] array;
	
	static void star(int x, int y, int n) {
		if(n==1) {
			array[x][y] = '*';
			return;
		}
		int m = n/3;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==1 && j==1)
					continue;
				star(x+m*i, y+m*j, m);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		array = new char[n][n];
		star(0,0,n);
		
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
	}

}
