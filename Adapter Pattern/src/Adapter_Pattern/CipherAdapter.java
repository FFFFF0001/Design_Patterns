package Adapter_Pattern;

public class CipherAdapter extends DataOperation
{

	private Cipher cipher;
	
	public CipherAdapter( )
	{
		cipher = new Cipher();
	}
	public String DoEncrypt(int Key, String PS) 
	{
		
		return cipher.DoEncrypt(Key, PS);
	}
	

}
