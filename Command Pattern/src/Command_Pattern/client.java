package Command_Pattern;

public class client {
	//客户端测试类
	
	public static void main(String[] args) {
		abstractCommand openCommand, closeCommand, changeCommand;

		openCommand = new tvOpenCommand();
		closeCommand = new tvCloseCommand();
		changeCommand = new tvChangeCommand();

		controller control = new controller( openCommand, closeCommand, changeCommand );
		control.open();
		control.close();
		control.change();
	}
}
