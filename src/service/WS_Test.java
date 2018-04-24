package service;

public class WS_Test {
	public static void main(String[] args) {

		//创建一个用于产生WebServicImpl实例的工厂，WebServcieImplService类是wsimport工具生成的
		WebServcieImplService webServcieImplService = new WebServcieImplService();

		//通过工厂生成一个WebServicImpl实例，WebServcieImpl是wsimplort工具生成的
		WebServcieImpl webServcieImplPort = webServcieImplService.getWebServcieImplPort();
		
		//调用WebServcie接口的sayHello方法（两个项目结合来使用，webService：项目，client：模拟器-用于测试）
		String sayHello = webServcieImplPort.sayHello("xuesibianxing");
		
		System.out.println("返回的结果是："+sayHello);
	}
}
