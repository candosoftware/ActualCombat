package com.selfstudy.sec01;
class A{					// ������A
	public void fun1(){		// ����fun1()����
		System.out.println("A --> public void fun1(){}") ;
	}
	public void fun2(){
		this.fun1() ;		// ����fun1()����
	}
};
class B extends A{
	public void fun1(){		// �˷��������าд��
		System.out.println("B --> public void fun1(){}") ;
	}
	public void fun3(){
		System.out.println("B --> public void fun3(){}") ;
	}
};
class C extends A{
	public void fun1(){		// �˷��������าд��
		System.out.println("C --> public void fun1(){}") ;
	}
	public void fun5(){
		System.out.println("C --> public void fun5(){}") ;
	}
};

public class PolDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(new B()) ;	// ����B��ʵ��
		fun(new C()) ;	// ����B��ʵ��
	}
	public static void fun(A a){
		a.fun1() ;		// ���ø�д�����е�fun1()����
	}

	}


