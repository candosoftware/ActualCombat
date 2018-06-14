package com.selfstudy.sec01;
interface USB{              //定义USB接口
	public void start();    //定义一个公有的启动方法
	public void stop();     //定义一个公有的停止方法
	
}
class computer{
	public static void plugin(USB usb){  //定义一个公有静态无返回值的方法，只要是USB设备都可以插入
		usb.start();
		System.out.println("usb设备启动");
		usb.stop();
	}	
};
class Flash implements USB{                 //U盘
	public void start(){                    //覆写接口的 start方法
		System.out.println("U盘设备启动");
	} 
	public void stop(){                     //覆写接口stop方法
		System.out.println("U盘设备停止");       
	}
}
class Print implements USB{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("打印机启动");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("打印机停止");
	}
	
}
public class PolDemo06 {
	public static void main(String args[]){
		computer.plugin(new Flash());		
        computer.plugin(new Print());
	}

}
