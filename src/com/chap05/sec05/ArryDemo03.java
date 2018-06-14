package com.chap05.sec05;

public class ArryDemo03 {
	public static void main(String args[]){
		int score[] = {88,99,79,100,87,89,67};
		int temp;
		for(int i=1;i<score.length;i++){
			for(int j=0;j<score.length;j++){
				if (score[i] < score[j]){
					temp = score[j];
					score[j] = score[i];
					score[i] = temp;					
				}
				
			}
			
			}
		    for(int x=0;x<score.length;x++){
			System.out.println(score[x]);
		}
	}

}
