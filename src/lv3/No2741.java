package lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2741 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

}
