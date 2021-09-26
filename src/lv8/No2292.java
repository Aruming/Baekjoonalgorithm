package lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2292 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int room = 1, cnt = 1;
		while(room<n) {
			room += cnt*6;
			cnt++;
		}
		System.out.println(cnt);
	}

}
