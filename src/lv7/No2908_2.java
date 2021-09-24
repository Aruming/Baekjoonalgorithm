package lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2908_2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String a = st.nextToken();
		String b = st.nextToken();
		
		StringBuffer sb1 = new StringBuffer(a);
		StringBuffer sb2 = new StringBuffer(b);
		int reverseA = Integer.parseInt(sb1.reverse().toString());
		int reverseB = Integer.parseInt(sb2.reverse().toString());
		
		int ans;
		if(reverseA>reverseB) {
			ans = reverseA;
		}else {
			ans = reverseB;
		}
		System.out.println(ans);		
	}

}
