package array1;

import java.util.Scanner;

public class Solution_D2_5431_민석이의과제체크하기_서울8반_이재은 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int tc=0;tc<T;tc++) {
			
		int all=sc.nextInt();
		int summit=sc.nextInt();
		int who;
		 int su[]=new int[all];
		 
		 for(int i=0;i<summit;i++) {
			 who=sc.nextInt();
			 su[who-1]++;
			 who=0;
		 }			

		 System.out.print("#"+(tc+1)+" ");

		 for(int i=0;i<all;i++) {

			 if(su[i]==0) {
				 System.out.print((i+1)+" ");		 }
		 }
		System.out.println();
	}
		}

}
