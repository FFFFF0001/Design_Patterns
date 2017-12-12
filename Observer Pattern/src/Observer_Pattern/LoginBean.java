package Observer_Pattern;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginBean extends JPanel implements ActionListener {
	//LoginBean充当具体目标类(登录控件)

	JLabel labUserName;
	JLabel labPassWord;
	JTextField txtUserName;
	JPasswordField txtPassWord;
	JButton btnLogin;
	JButton btnClear;

	LoginEventListener lel;//定义一个抽象观察者对象
	LoginEvent le;//定义一个事件对象，用于传输数据

	public LoginBean() {

		this.setLayout( new GridLayout(3,2) );
		labUserName = new JLabel( "User Name:" );
		add( labUserName );

		txtUserName = new JTextField( 20 );
		add( txtUserName );

		labPassWord = new JLabel( "PassWord:" );
		add( labPassWord );

		txtPassWord = new JPasswordField( 20 );
		add( txtPassWord );

		btnLogin = new JButton( "Login" );
		add( btnLogin );

		btnClear = new JButton( "Clear" );
		add( btnClear );

		btnClear.addActionListener( this );
		btnLogin.addActionListener( this );

	}

	//实现注册方法
	void addLoginEventListener( LoginEventListener lel ) {
		this.lel = lel;
	}

	//实现通知方法
	private void fireLoginEvent( Object object, String userName, String PassWord ) {
		le = new LoginEvent( btnLogin, userName, PassWord );
		lel.validateLogin( le );
	}

	public void actionPerformed( ActionEvent event ) {
		if( btnLogin == event.getSource() ){
			String userName = this.txtUserName.getText();
			String PassWord = this.txtPassWord.getText();

			fireLoginEvent( btnLogin, userName, PassWord );
		}
		if( btnClear == event.getSource() ){
			this.txtUserName.setText( "" );
			this.txtPassWord.setText( "" ); 
		}
	}

}
