package lv9;

import java.util.Scanner;

public class No9020 {
	
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
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int half = n/2;
						
			if(PNumber(half)) {
				System.out.println(half+" "+half);
			}
			else {
				int a = half-1, b = half+1;
				while((PNumber(a) && PNumber(b)) != true) {
					a--;
					b++;
				}
				System.out.println(a+" "+b);
			}
		}
	}

}
