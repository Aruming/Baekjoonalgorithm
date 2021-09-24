package lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1316 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int cnt=t;
		
		for(int i=0;i<t;i++) {
			String s = br.readLine();
			boolean alpha[] = new boolean[26];
			for(int j=0;j<s.length()-1;j++) {
				alpha[s.charAt(j)-97]=true;
				if((s.charAt(j)!=s.charAt(j+1)) && (alpha[s.charAt(j+1)-97]==true)) {
					cnt--;
					break;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
