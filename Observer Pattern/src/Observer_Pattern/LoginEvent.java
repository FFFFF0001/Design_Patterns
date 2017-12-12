package Observer_Pattern;

import java.util.EventObject;

public class LoginEvent extends EventObject {
	//LonginEvent表示事件类，它用于封装与事件有关的信息。它不是观察者模式的一部分，但它可以在目标对象和观察者对象之间传递数据
	private String userName;
	private String passWord;

	public LoginEvent( Object source, String userName, String passWord ) {
		super( source );
		this.userName = userName;
		this.passWord = passWord;
	}

	public void setUserName( String userName ) {
		this.userName = userName;
	}

	public String getUserName( ) {
		return this.userName;
	}

	public void setPassWord( String passWord ) {
		this.passWord = passWord;
	}

	public String getPassWord( ) {
		return passWord;
	}

}
