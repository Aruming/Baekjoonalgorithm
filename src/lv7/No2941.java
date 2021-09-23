package lv7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2941 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		String s = br.readLine();
		
		//문자열 교환
		s = s.replaceAll("c=", "c");
		s = s.replaceAll("c-", "c");
		s = s.replaceAll("dz=", "c");
		s = s.replaceAll("d-", "c");
		s = s.replaceAll("lj", "c");
		s = s.replaceAll("nj", "c");
		s = s.replaceAll("s=", "c");
		s = s.replaceAll("z=", "c");
		
		System.out.println(s.length());
	}

}
