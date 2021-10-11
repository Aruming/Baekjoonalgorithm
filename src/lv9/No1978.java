package lv9;

import java.util.Scanner;

public class No1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num, rnum;
		int cnt=n;
		
		for(int i=0;i<n;i++) {
			num = sc.nextInt();
			rnum = (int)Math.sqrt(num);
			
			if(num==1) {
				cnt--;
			}
			else {
				for(int j=2;j<=rnum;j++) {
					if(num%j==0) {
						cnt--;
						break;
					}
				}
			}
				
		}
		System.out.println(cnt);
	}

}
