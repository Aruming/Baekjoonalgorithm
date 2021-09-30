package lv8;

import java.util.Scanner;

public class No2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int k, n;
		int live[][] = new int[15][15];
		
		//층수는 0부터, 호수는 1부터 시작한다는 점에 유의
		for(int i=0;i<15;i++) {
			live[0][i] = i+1;  //0층의 i호
			live[i][0] = 1;  //각 층의 1호
		}
		
		for(int j=1;j<15;j++) {
			for(int m=1;m<15;m++) {
				live[j][m] = live[j-1][m] + live[j][m-1];  //규칙에 따라 호수의 인원수 계산
			}
		}
		
		for(int i=0;i<t;i++) {
			k = sc.nextInt();
			n = sc.nextInt();			
			System.out.println(live[k][n-1]);
			 //배열인덱스 0부터 시작 / 호수는 1부터 시작이므로 -1 해주어야함
		}
	}

}
