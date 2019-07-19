package com.ssafy.algo;

import java.util.Scanner;

public class Solution22소금쟁이_서울8반_이재은_주석 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
        for(int tc=0;tc<T;tc++) {
        int n=sc.nextInt();//연못 사이즈
        int so=sc.nextInt(); //소금쟁이 수
        int [][]y=new int[n][n];//연못 생성
        int N=y.length; //연못의 길이 즉 n
        int soh=0,soy=0,b;
        int iter=so;
        for(int i=0;i<iter;i++) { //소금쟁이 받기
            soh=sc.nextInt(); //소금쟁이 y
            soy=sc.nextInt(); //소금쟁이 x
            b=sc.nextInt(); //소금쟁이 dir
            y[soh][soy]=b; //맵에 방향을 넣어준다.
            /*i=soh;#######여기서 변수를 중복으로 사용함. 그러면 for문 고장남*/
            int I=soh;
            int j=soy;
            int cnt=0,jump=0;
                switch(y[I][j]) {
            
            case 1://위쪽이면
                for(int ii=0;ii<3;ii++) {
                    if(ii==0)jump=3;
                    else if(ii==1)jump=2;
                    else if(ii==2)jump=1;
               
                    if(0<=I-jump&&y[I-jump][j]==0) {
                        y[I-jump][j]=y[I][j];//새로운 곳에는 현재dir를 넣어준다.
                        if(ii<2) y[I][j]=0; //그리고 현재 dir을 제거해주고 (이동했으니까, 마지막 경우에는 더 이동안하니까 안지움. 그래서 ii<2)
                        I-=jump;
                    }
                    //즉 다음번에도 switch를 통해서 한 방향으로 계속 갈 수 있도록
                    else {so--;break;}//
                   //######여기서 문제가 있음.
                    //먼저 뛴 소금쟁이 중, 조건에 만족해서 살아 있을 소금쟁이(마지막 점프)
                    //그 걸 표현해줘야함.
                    //그래야 다음번에 뛰는 소금쟁이들이랑 부딪치는지를 통해서 개수를 구함.
                    //이 로직으로 이어갈 거면 점프를 뛰기전에 지워주고(=0) dir을 표현하면 됨.
                }
                break;
                
            case 2://하
            	for(int ii=0;ii<3;ii++) {
                    if(ii==0)jump=3;
                    else if(ii==1)jump=2;
                    else if(ii==2)jump=1;
            
                    if(I+jump<n&&y[I+jump][j]==0) {
                        y[I+jump][j]=y[I][j];//새로운 곳에는 dir를 넣어준다.
                        if(ii<2) y[I][j]=0;
                        I+=jump;
                    }
 
                    else {so--;break;}//
            	}
            	break;
            case 3://좌
            	for(int ii=0;ii<3;ii++) {
                    if(ii==0)jump=3;
                    else if(ii==1)jump=2;
                    else if(ii==2)jump=1;
       
                    if(0<=j-jump&&y[I][j-jump]==0) {
                        y[I][j-jump]=y[I][j];//새로운 곳에는 dir를 넣어준다.
                        if(ii<2) y[I][j]=0;
                    	j-=jump;
                    }
                    else {so--;break;}//
            	}
            	break;
                
            case 4://우
            	for(int ii=0;ii<3;ii++) {
                    if(ii==0)jump=3;
                    else if(ii==1)jump=2;
                    else if(ii==2)jump=1;
       
                    if(j+jump<n&&y[I][j+jump]==0) {
                        y[I][j+jump]=y[I][j];//새로운 곳에는 dir를 넣어준다.
                        if(ii<2) y[I][j]=0;
                    	j+=jump;
                    }
                    else {so--;break;}//
            	}
            	break;
            default:
                break;
                
            
            }
            
            
                
        }
        System.out.println("#"+(tc+1)+" "+so);
       }
    
    }
}