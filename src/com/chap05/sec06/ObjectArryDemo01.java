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
		person6 per[] =  new person6[3];    //声明了3个对象数组
		System.out.println("声明了三个对象数组,数组对象的默认值为null");
		for(int i=0;i<per.length;i++){
			System.out.println(per[i]);
		}
		System.out.println("实例化数组对象，并将属性打印输出");
		//动态初始化实例，除了动态初始化实例外，还可以静态初始化
		//person6 per[] = {new person6("张三")，new person6("李明"),new person6("大郎"))};
		per[0] = new person6("张三");    //实例化第一个元素
		per[1] = new person6("李明");     //实例化第二个元素
		per[2] = new person6("大郎");
		for(int j=0;j<per.length;j++){
			System.out.println(per[j].getName());
		}
		
	}
	

}
