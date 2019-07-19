package array1;

import java.util.Scanner;

public class Solution_D1_1289_원재의메모리복구하기_서울8반_이재은 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		String str=new String();
		
		for(int tc=0; tc<T; tc++){
			
		int cnt=0;
		str= sc.next(); 

		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='1') {
						cnt++;	
					for(int j=i+1;j<str.length();j++) {
						if(str.charAt(j)=='0')cnt++;i++;break;
								}
			
		    }           }
		  	
          System.out.println("#"+(tc+1)+" "+cnt);
		}
		
		
	

}
}
