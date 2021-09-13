package lv6;

public class No4673 {
	
	public static int getDn(int n) {
		int dn = n;
		while(n != 0){
			dn += n%10;
			n=n/10;
		}
		return dn;			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans[] = new int[10001];
		
		for(int i=1;i<10001;i++) {
			ans[i] = i;   //범위 숫자 저장용 배열
		}
		for(int i=1;i<10001;i++) {
			int num = getDn(i);  //생성자로 만들어지는 숫자 구하기
			if(num<10001) {
				ans[num]=i;  //배열 값에 저장된 수를 생성자로 변경
				// 위 과정으로 배열값이 자기자신 -> 생성자로 바뀜
			}
			if(ans[i]==i) {  // 배열값이 배열순서와 같다면(생성자가 없다면)
				System.out.println(i);
			}
		}
		
	}

}
