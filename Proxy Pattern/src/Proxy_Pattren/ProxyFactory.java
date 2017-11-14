package Proxy_Pattren;

public class ProxyFactory implements AbstractFactory {
	
	private AFactory afactory = new AFactory();
	private BFactory bfactory = new BFactory();
	
	private int choose = 2;
	
	public void setChoose( int choose )
	{
		this.choose = choose;
	}
	
	public void Produce() 
	{
		if( choose == 0 )
		{
			afactory.Produce();
		}
		
		if( choose == 1 )
		{
			bfactory.Produce();
		}
	}

}
