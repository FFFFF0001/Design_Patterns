package Flyweight_Pattern;

public class LiuDehua implements Artist
{
	//刘德华类
	private String type;
	
	public LiuDehua( String type )
	{
		this.type = type;
	}
	
	public String getName()
	{
		return this.type;
	}
	
	public void Info()
	{
		System.out.println("歌唱者姓名为：" + this.type);
	}

}
