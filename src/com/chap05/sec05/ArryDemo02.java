package com.chap05.sec05;

public class ArryDemo02 {
	public static void main(String args[]){
		int score[] = {90,80,99,77,65,100,73};  //����һ������ ����̬��ֵ
		for(int i=0;i<score.length;i++){
		System.out.println("scoer["+i+"] = "+score[i]);
		}
		int max = 0,min = 0;                    //�����������ͱ���
		max = min = score[0];                   //��score��0�� ��ֵ����������
		for(int x=0;x<score.length;x++){
			
			if(max<score[x]){
				max = score[x];                    //ѭ��������ֵ
			}
			if(min>score[x]){
				min = score[x];                    //ѭ�������Сֵ
			}
		}
		System.out.println("�������ֵ�ǣ� " + max);     //��ӡ���
		System.out.println("������Сֵ�ǣ�"  +min);
		
	}

}
