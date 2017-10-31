package Adapter_Pattern;

public abstract class DataOperation {
	private String Password;
	public void setPassword( String Password )
	{
		this.Password = Password;
	}
	
	public String GetPassword()
	{
		return this.Password;
	}
	
	public abstract String DoEncrypt( int Key, String PS );//实现数据加密

}
