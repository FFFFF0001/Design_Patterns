package Command_Pattern;

public class television {
	//接受者类(电视机)
	public void open(){
		System.out.println("打开电视机!");
	}

	public void close(){
		System.out.println("关闭电视机!");
	}

	public void changeChannel(){
		System.out.println("切换电视频道!");
	}
}
