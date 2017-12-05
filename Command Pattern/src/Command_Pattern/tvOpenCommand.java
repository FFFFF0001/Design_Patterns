package Command_Pattern;

public class tvOpenCommand implements abstractCommand {
	//具体命令类(打开命令)
	
	private television tv;

	public tvOpenCommand(){
		tv = new television();
	}

	public void execute() {
		tv.open();
	}
}
