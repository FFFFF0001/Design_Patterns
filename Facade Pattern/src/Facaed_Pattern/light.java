package Facaed_Pattern;

public class light extends electricalAppliances{
	private int number;
	public light( int number )
	{
		this.number = number;
	}
	public void on()
	{
		System.out.println("第"+this.number+"号灯打开");
	}
	public void off()
	{
		System.out.println("第"+this.number+"号灯关闭");
	}
}
