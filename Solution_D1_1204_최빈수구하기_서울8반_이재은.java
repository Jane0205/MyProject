package array1;

import java.util.Scanner;

public class Solution_D1_1204_최빈수구하기_서울8반_이재은 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int i=0;i<N;i++) {
			int max=0,imax=0;
			int tc=sc.nextInt();
			int arr[]=new int[101];
		
			for(int stc=0;stc<1000;stc++) {
				int T=sc.nextInt();
				arr[T]++;
				
			// 최빈수가 여러개일 경우 조건 추가하기
				
				for(int j=0;j<arr.length;j++) {
					if(arr[T]>=max) {
						max=arr[T];
						imax=T;
						}
				}
			}System.out.println("#"+tc+" "+imax);
	}
	}

}
