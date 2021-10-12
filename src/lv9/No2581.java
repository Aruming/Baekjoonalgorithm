package lv9;

import java.util.Scanner;

public class No2581 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		boolean result;
		int min=0, sum=0, j;
		
		for(int i=m;i<=n;i++) {
			int rI = (int)Math.sqrt(i);
			if(i==1) {
				continue;
			}
			for(j=2;j<=rI;j++) {
				if(i%j==0)
					break;
			}
			if(j==rI+1) {
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
