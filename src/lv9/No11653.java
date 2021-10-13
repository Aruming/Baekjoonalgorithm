package lv9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11653 {
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
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a=2;
		
		if(PNumber(n)) {
			System.out.println(n);
		}
		else {
			while(n>1) {
				if(PNumber(a)==false)
					a++;
				
				if(n%a==0) {
					System.out.println(a);
					n/=a;
				}
				else {
					a++;
				}
			}
		}
	}

}
