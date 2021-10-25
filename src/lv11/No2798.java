package lv11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2798 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] num = br.readLine().split(" ");
		int n = Integer.parseInt(num[0]);
		int m = Integer.parseInt(num[1]);
		
		String[] card_ = br.readLine().split(" ");
		int[] card = new int[n];
		for(int i=0;i<card_.length;i++) {
			card[i] = Integer.parseInt(card_[i]);
		}
		
		int i, j, k, max = 0;
		for(i=0;i<n-2;i++) {
			for(j=i+1;j<n-1;j++) {
				for(k = j+1;k<n;k++){
					if((card[i]+card[j]+card[k]<=m)&&card[i]+card[j]+card[k]>max)
						max = card[i]+card[j]+card[k];
				}
			}
		}
		
		System.out.println(max);
	}

}
