package com.chap05.sec06;
class person6{
	private String name;
	person6(String name){
		this.name = name;
	}
	public  String getName(){
		return this.name;		
	}
}

public class ObjectArryDemo01 {
	public static void main(String args[]){
		person6 per[] =  new person6[3];    //������3����������
		System.out.println("������������������,��������Ĭ��ֵΪnull");
		for(int i=0;i<per.length;i++){
			System.out.println(per[i]);
		}
		System.out.println("ʵ����������󣬲������Դ�ӡ���");
		//��̬��ʼ��ʵ�������˶�̬��ʼ��ʵ���⣬�����Ծ�̬��ʼ��
		//person6 per[] = {new person6("����")��new person6("����"),new person6("����"))};
		per[0] = new person6("����");    //ʵ������һ��Ԫ��
		per[1] = new person6("����");     //ʵ�����ڶ���Ԫ��
		per[2] = new person6("����");
		for(int j=0;j<per.length;j++){
			System.out.println(per[j].getName());
		}
		
	}
	

}
