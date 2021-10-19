package lv9;

import java.util.Scanner;

public class No1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			int distancePow = (int)Math.pow(x1-x2,2)+(int)Math.pow(y1-y2, 2);
			
			if(distancePow == Math.pow(r1+r2, 2) || distancePow == Math.pow(Math.abs(r1-r2),2))
				System.out.println("1");
			else if(distancePow > Math.pow(r1+r2, 2) || distancePow < Math.pow(Math.abs(r1-r2),2))
				System.out.println("0");
			else if(r1==r1 && distancePow==0)
				System.out.println("-1");
			else
				System.out.println("2");
		}
	}

}
