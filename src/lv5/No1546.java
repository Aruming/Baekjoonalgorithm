package lv5;

import java.util.Scanner;

public class No1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		n = sc.nextInt();  //시험과목수
		double max=0, sum=0;
		double score[] = new double[n];
		
		for(i=0;i<n;i++) {
			score[i] = sc.nextInt();
			if(max<score[i]) {
				max = score[i];  //점수 최대값
			}
		}
		
		for(i=0;i<n;i++) {
			sum += (score[i]/max)*100;  //조작한 점수의 총합
		}
		System.out.println(sum/n);
	}

}
