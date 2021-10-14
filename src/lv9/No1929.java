package lv9;

import java.util.Scanner;

public class No1929 {
	
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
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i=m;i<=n;i++) {
			if(PNumber(i)) {
				System.out.println(i);
			}
		}
	}

}
