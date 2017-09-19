package Builder_Pattern;

public class BMWComponentBuilder extends ComponentBuilder{
	
	public void BuildSteeringWheel()
	{
		component.SetSteeringWheel("奔驰方向盘");
	}
	public void BuildTyre()
	{
		component.SetTyre("奔驰轮胎");
	}
	public void BuildEngine()
	{
		component.SetEngine("奔驰发动机");
	}

}
