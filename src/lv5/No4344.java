package lv5;

import java.util.Scanner;

public class No4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();  //테스트케이스 수
						
		for(int i=0;i<c;i++) {			
			int n = sc.nextInt();			//학생 수
			int score[] = new int[n];
			int sum=0;
			
			for(int j=0;j<n;j++) {				
				score[j] = sc.nextInt();	//점수 입력			
				sum += score[j];				
			}
			
			double avg = (double)sum/n;  //점수 평균
			int cnt=0;
			
			for(int j=0;j<n;j++) {
				if(score[j]>avg) {
					cnt++;   //평균 넘는 학생 수
				}
			}
			
			double rate = (double)cnt/n*100;  //평균 넘는 학생 비율
			System.out.printf("%.3f", rate);  //소수점 셋째자리까지
			System.out.println("%");
		}

	}

}
