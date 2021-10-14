package lv9;

import java.util.Scanner;

public class No4948 {
	
	static boolean PNumber(int num) {
		int rnum = (int)Math.sqrt(num);
		if(num==1) {
			return false;
		}
		for(int j=2;j<=rnum;j++) {
			if(num%j==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			int cnt=0;
			
			if(n==0)
				break;
			
			for(int i=n+1;i<=2*n;i++) {
				if(PNumber(i)) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
	}

}
