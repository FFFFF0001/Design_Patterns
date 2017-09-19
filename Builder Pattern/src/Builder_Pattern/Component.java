package Builder_Pattern;

public class Component {
	private String SteeringWheel;
	private String Tyre;
	private String Engine;
	
	public void SetSteeringWheel( String SteeringWheel )
	{
		this.SteeringWheel = SteeringWheel;
	}
	public void SetTyre( String Tyre )
	{
		this.Tyre = Tyre;
	}
	public void SetEngine( String Engine )
	{
		this.Engine = Engine;
	}
	
	public String getSteeringWheel()
	{
		return (this.SteeringWheel);
	}
	
	public String getTyre()
	{
		return (this.Tyre);
	}
	
	public String getEngine()
	{
		return (this.Engine);
	}
	
	

}
