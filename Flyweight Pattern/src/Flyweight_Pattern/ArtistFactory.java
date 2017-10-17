package Flyweight_Pattern;
import java.util.*;

public class ArtistFactory {
	//艺术家工厂类
	private ArrayList atrises = new ArrayList();
	private int totalTerminal = 0;
	
	public ArtistFactory()
	{
		Artist at1 = new WangFei("王菲--2012年--《仍是旧句子》");
		atrises.add( at1 );
		
		Artist at2 = new LiuDehua("刘德华--1981年--《彩云曲》");
		atrises.add( at2 );
	}
	
	public Artist getAtrises( String type )
	{
		if( type.equalsIgnoreCase("刘德华") )
		{
			totalTerminal++;
			return (Artist)atrises.get(1);
		}
		else if( type.equalsIgnoreCase("王菲") )
		{
			totalTerminal++;
			return (Artist)atrises.get(0);
		}
		else
		{
			return null;
		}
	}
	
	public int getTotalAtrises()
	{
		return atrises.size();
	}
	public int getTotalCD()
	{
		return totalTerminal;
	}
	
}
