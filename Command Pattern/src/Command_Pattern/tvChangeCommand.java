package Command_Pattern;

public class tvChangeCommand implements abstractCommand {
	//具体命令类(关闭命令)
	
	private television tv;

	public tvChangeCommand(){
		tv = new television();
	}

	public void execute() {
		tv.changeChannel();
	}
}
