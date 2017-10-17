package Flyweight_Pattern;

public class WangFei implements Artist
{
	//王菲类
	
	private String type;
	public WangFei( String type )
	{
		this.type = type;
	}
	public String getName( ) 
	{
		return this.type;
	}

	public void Info() 
	{
		System.out.println("歌唱者姓名为：" + this.type);

	}

}
