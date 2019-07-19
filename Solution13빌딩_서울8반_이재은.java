package com.ssafy.algo;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution13빌딩_서울8반_이재은 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\Solution13.txt"));
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int tc=0;tc<T;tc++) {
		int n=sc.nextInt();
		int max=0;
		char [][]g=new char[n][n];
		int N=g.length;
		int M=g.length;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				g[i][j]=sc.next().charAt(0);
			}}
		for(char[] w:g)System.out.println(Arrays.toString(w));
		//	
				int[] di= {-1,-1,0,1,1,1,0,-1}; //x축의 변화
				int[] dj= {0,1,1,1,0,-1,-1,-1}; //y축의 변화
				for(int i=0;i<N;i++) {
					for(int j=0;j<M;j++) {
						int floor=0,floorg=0;
						if(g[i][j]=='B') {
							for(int d=0;d<di.length;d++) {
								int ni=i+di[d];
								int nj=j+dj[d];
								//System.out.println(a[ni][nj]);
								
								if(0<=ni&&ni<N&&0<=nj&&nj<M) {
									if(g[ni][nj]=='G') {
										floorg=2;
										if(max<floorg)max=floorg;
										break;}
								
								}
							}

		 
							if(floorg!=2) { // 세로 가로 위치 B더하기
								for(int t=0;t<N;t++) {
									if(g[t][j]=='B')floor++;	
								}
									for(int k=0;k<M;k++) {
										if(g[i][k]=='B')floor++;
								}
							floor--;
							}
							if(max<floor)max=floor;}
		
					}
				}
				System.out.println("#"+(tc+1)+" "+max);
		}
	}

}