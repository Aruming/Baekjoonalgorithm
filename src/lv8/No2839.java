package lv8;

import java.util.Scanner;

public class No2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt=0;
		
		while(n>0) {
			if(n<3){
				cnt=-1;
				break;
			}
			else if(n%5==0) {
				cnt+=n/5;
				break;
			}
			else {
				n-=3;
				cnt++;
			}
		}
		System.out.println(cnt);		
	}

}
