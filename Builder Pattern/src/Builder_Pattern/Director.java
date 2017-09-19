package Builder_Pattern;

public class Director {
	
	private ComponentBuilder cb;
	
	public void setComponentBuilder( ComponentBuilder cb )
	{
		this.cb = cb;
	}
	
	public Component construct()
	{
		cb.BuildEngine();
		cb.BuildSteeringWheel();
		cb.BuildTyre();
		return cb.GetComponent();
	}

}
