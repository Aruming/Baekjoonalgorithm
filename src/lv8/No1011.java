package lv8;

import java.util.Scanner;

public class No1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int x, y, distance, cnt, move;
		
		for(int i=0;i<t;i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			distance = y-x;
			move = 1;
			
			if(distance==1) {
				cnt = 1;
			}
			else if(distance==2) {
				cnt = 2;
			}
			else {
				cnt=2;
				distance -=2;
				while(distance>0) {
					if(distance>move) {
						distance-=(move+1);
						move = move+1;
						cnt++;
					}
					else if(distance == move) {
						cnt++;
						break;
					}
					else {
						distance -= (move-1);
						move = move-1;
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
		}
	}

}
