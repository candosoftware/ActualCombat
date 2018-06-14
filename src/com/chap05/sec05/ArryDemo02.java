package com.chap05.sec05;

public class ArryDemo02 {
	public static void main(String args[]){
		int score[] = {90,80,99,77,65,100,73};  //定义一个数组 并静态赋值
		for(int i=0;i<score.length;i++){
		System.out.println("scoer["+i+"] = "+score[i]);
		}
		int max = 0,min = 0;                    //定义两个整型变量
		max = min = score[0];                   //将score【0】 赋值给两个变量
		for(int x=0;x<score.length;x++){
			
			if(max<score[x]){
				max = score[x];                    //循环求出最大值
			}
			if(min>score[x]){
				min = score[x];                    //循环求出最小值
			}
		}
		System.out.println("数组最大值是： " + max);     //打印输出
		System.out.println("数组最小值是："  +min);
		
	}

}
