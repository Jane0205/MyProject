package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_D2_1208_Flatten_서울8반_이재은 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);

		for(int tc=0;tc<10;tc++) {
			
			int block[]=new int[100];
			int max=0,min = 0,dump=0;
			
			dump=sc.nextInt();
		
			for(int i=0;i<100;i++) {
				block[i]=sc.nextInt();}
			
			Arrays.sort(block);

			for(int j=0;j<dump;j++) {

				if(block[99]==block[0]) {
					max=block[99];
			        min=block[0];
					break;}
				
				block[99]--;
				block[0]++;
				Arrays.sort(block);
				//마지막에 정렬된값에서 max min을 뽑아야되기 때문에 한번더 정렬해야함ㅜㅜ		        
				max=block[99];
		        min=block[0];
			}int dap=max-min;
			System.out.println("#"+(tc+1)+" "+dap);
	}

}}
