package com.chap05.sec05;

public class ArryDemo01 {
	public static void main(String args[]){
   int score[] = new int[5];
   for(int i=0;i<score.length;i++){
	   score[i] = i*2+1;
   }
   for(int x=0;x<score.length;x++){
	   System.out.println("score"+"["+x+"] = "+score[x]);
	   
   }   
     }
}