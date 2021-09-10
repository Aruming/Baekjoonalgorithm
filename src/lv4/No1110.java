package lv4;

import java.util.Scanner;

public class No1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n, save, cnt;
		n = sc.nextInt();	//입력
		save = n;		//변수 복사
		cnt = 0;
		 
		while(true){
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
			cnt++;
		 
			if(save == n){
				break;
			}
		}
		System.out.println(cnt);
	}
}

