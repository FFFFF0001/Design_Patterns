package Proxy_Pattren;

public class Client {//代理模式  生产毛巾
	public static void main( String args[ ] )
	{
		AbstractFactory abstractfactory;
		abstractfactory = new ProxyFactory();
		
		abstractfactory.setChoose(0);
		abstractfactory.Produce();
		abstractfactory.setChoose(1);
		abstractfactory.Produce();	
	}

}
