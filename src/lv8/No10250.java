package lv8;

import java.util.Scanner;

public class No10250 {
	
	public static int roomNumber(int n, int h) {
		int xx, yy;
		yy = n%h;
		if(yy==0) {
			yy=h;
			xx=n/h;
		}
		else {
			xx=n/h+1;
		}
		
		int roomnumber = yy*100+xx;
		return roomnumber;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			int room = roomNumber(n, h);
			System.out.println(room);
		}
				
	}

}
