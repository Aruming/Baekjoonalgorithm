package lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2908 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String a = st.nextToken();
		String b = st.nextToken();
		
		String reverseA_ = "";
		String reverseB_ = "";
		for(int i=2;i>=0;i--) {
			reverseA_ += a.charAt(i);
			reverseB_ += b.charAt(i);
		}
		
		int reverseA = Integer.parseInt(reverseA_);
		int reverseB = Integer.parseInt(reverseB_);
				
		int ans;
		if(reverseA>reverseB) {
			ans = reverseA;
		}else {
			ans = reverseB;
		}
		System.out.println(ans);
		
		
		
	}

}
