package Command_Pattern;

public class tvCloseCommand implements abstractCommand {
	//具体命令类(关闭命令)
	
	private television tv;

	public tvCloseCommand(){
		tv = new television();
	}

	public void execute() {
		tv.close();
	}
	
}
