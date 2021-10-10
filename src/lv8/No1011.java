package lv8;

import java.util.Scanner;

public class No1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int x, y, distance, cnt = 0, max;
		
		for(int i=0;i<t;i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			distance = y-x;
			max = (int)Math.sqrt(distance);
			
			if(max*max==distance)
				cnt = 2*max - 1;
			else if(distance<=(max*max)+max)
				cnt = 2*max;
			else
				cnt = 2*max + 1;
			
			System.out.println(cnt);
		}
		
	}
}


