package lv11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No7568 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] info = new int[n][2];
		for(int i=0;i<n;i++) {
			String[] buff = br.readLine().split(" ");
			info[i][0] = Integer.parseInt(buff[0]);
			info[i][1] = Integer.parseInt(buff[1]);
		}
		
		for(int i=0;i<n;i++) {
			int rank=1;
			for(int j=0;j<n;j++) {
				if(i==j)
					continue;
				
				if(info[i][0]<info[j][0] && info[i][1]<info[j][1])
					rank++;
			}
			System.out.print(rank+" ");
		}
		
	}
}
