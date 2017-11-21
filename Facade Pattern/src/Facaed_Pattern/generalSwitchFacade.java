package Facaed_Pattern;

public class generalSwitchFacade {
	private light lights[] = new light[3];
	private fan fan;
	private airConditioner ac;
	private television tv;

	public generalSwitchFacade()
	{
		lights[0] = new light(1);
		lights[1] = new light(2);
		lights[2] = new light(3);
		fan = new fan();
		ac = new airConditioner();
		tv = new television();		
	}
	
	public void on()
	{
		lights[0].on();
		lights[1].on();
		lights[2].on();
		fan.on();
		ac.on();
		tv.on();
	}
	
	public void off()
	{
		lights[0].off();
		lights[1].off();
		lights[2].off();
		fan.off();
		ac.off();
		tv.off();
	}

}
