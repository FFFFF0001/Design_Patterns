package Adapter_Pattern;

public final class Cipher {
	
	public String DoEncrypt( int Key, String PS )
	{
		String es = "";
		for( int i = 0 ; i<PS.length() ; i++ )
		{
			String c = String.valueOf( PS.charAt(i)%Key );
			es += c;
		}
		return es;
	}

}
