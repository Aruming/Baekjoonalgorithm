package lv11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2231 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0, num = 0, result = 0;
		for(int i=1;i<n;i++) {
			sum = i;
			num = i;
			while(num>0) {
				sum+=num%10;
				num/=10;
			}
			
			if(sum==n) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
