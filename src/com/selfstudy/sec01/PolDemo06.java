package com.selfstudy.sec01;
interface USB{              //����USB�ӿ�
	public void start();    //����һ�����е���������
	public void stop();     //����һ�����е�ֹͣ����
	
}
class computer{
	public static void plugin(USB usb){  //����һ�����о�̬�޷���ֵ�ķ�����ֻҪ��USB�豸�����Բ���
		usb.start();
		System.out.println("usb�豸����");
		usb.stop();
	}	
};
class Flash implements USB{                 //U��
	public void start(){                    //��д�ӿڵ� start����
		System.out.println("U���豸����");
	} 
	public void stop(){                     //��д�ӿ�stop����
		System.out.println("U���豸ֹͣ");       
	}
}
class Print implements USB{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("��ӡ������");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("��ӡ��ֹͣ");
	}
	
}
public class PolDemo06 {
	public static void main(String args[]){
		computer.plugin(new Flash());		
        computer.plugin(new Print());
	}

}
