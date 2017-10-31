package Adapter_Pattern;

public class CaesarAdapter extends DataOperation
{

	private Caesar caesar;
	
	public CaesarAdapter( )
	{
		caesar = new Caesar();
	}
	public String DoEncrypt(int Key, String PS) 
	{
		
		return caesar.DoEncrypt(Key, PS);
	}
	

}
