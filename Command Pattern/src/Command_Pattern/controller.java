package Command_Pattern;

public class controller {
	//调用者类(遥控器)

	private abstractCommand openCommand, closeCommand,changeCommand;
	public controller( abstractCommand openCommand, abstractCommand closeCommand, abstractCommand changeCommand ){
		this.openCommand = openCommand;
		this.closeCommand = closeCommand;
		this.changeCommand = changeCommand;
	}

	public void open(){
		openCommand.execute();
	}

	public void change(){
		changeCommand.execute();
	}

	public void close(){
		closeCommand.execute();
	}

}
