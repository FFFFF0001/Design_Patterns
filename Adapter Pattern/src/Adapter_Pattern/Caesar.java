package Adapter_Pattern;

public final class Caesar {
	
	public String DoEncrypt( int Key, String PS )
	{
		String es = "";
		for( int i = 0 ; i<PS.length() ; i++ )
		{
			char c = PS.charAt(i);
			if( c >='a'&& c<='z' )
			{
				c += Key%26;
				if( c >'z' )
					c -= 26;
				if( c < 'a' )
					c += 26;
			}
			if( c >= 'A' && c <= 'Z' )
			{
				 c += Key%26;
				 if( c >'Z' )
					c -= 26;
				if( c < 'A' )
					c += 26;
			}
			es += c;
		}
		return es;
	}

}
