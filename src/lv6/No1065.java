package lv6;

import java.util.Scanner;

public class No1065 {
	
	public static int Hansu(int n) {
		int cnt=0, result=0;  //cnt=100이상 한수 개수, result=최종 한수 개수
		
		if(n<100) {  //두자리수는 수열을 이루지 못해 모두 한수
			result = n;
		}else {
			for(int i=100;i<=n;i++) {
				int hun = i/100;
				int ten = (i/10)%10;
				int one = i%10;        //각 자리수의 숫자 추출
					
				if((ten-one)==(hun-ten)) {  //등차수열인지 판별
					cnt++;  //맞다면 cnt 증가
				}				
			}
			result = cnt+99;  //100이상 한수 개수 + 1~99는 모두 한수
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int han = Hansu(n);
		System.out.println(han);

	}

}
