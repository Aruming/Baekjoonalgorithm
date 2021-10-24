package lv10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No11729 {
	public static BufferedReader br;
	public static BufferedWriter bw;
	static void move(int no, int x, int y) throws IOException {
		if(no==1) {
			bw.write(x+" "+y+"\n");
		}
		else {
			move(no-1, x, 6-x-y);
			bw.write(x+" "+y+"\n");
			move(no-1, 6-x-y, y);
		}	
	}

	public static void main(String[] args) throws IOException{
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		System.out.println((int)Math.pow(2, n)-1);
		move(n, 1, 3);
		
		bw.flush();
		br.close();
		bw.close();
	}

}
