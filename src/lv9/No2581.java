package lv9;

import java.util.Scanner;

public class No2581 {
	
	static boolean Number(int num) {
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
		boolean result;
		int min=0, sum=0;
		
		for(int i=m;i<=n;i++) {
			result = Number(i);
			if(result) {
				if(min==0)
					min=i;
				sum+=i;
			}				
		}
	

		if(sum==0)
			System.out.println("-1");
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}

