package Builder_Pattern;

public abstract class ComponentBuilder {
	
	protected Component component = new Component();
	
	public abstract void BuildSteeringWheel();
	public abstract void BuildTyre();
	public abstract void BuildEngine();
	
	public Component GetComponent()
	{
		return component;
	}

}
