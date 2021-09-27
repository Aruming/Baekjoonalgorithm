package lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1193 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		int n = x, i=1;
		while(n>0) {
			n-=i;
			i++;
		}
		
		int cnt = i-1;
		int k = n + cnt;
		
		if(cnt%2==0) {
			System.out.println((k)+"/"+(cnt-k+1));
		}
		else {
			System.out.println((cnt-k+1)+"/"+k);
		}

	}

}
