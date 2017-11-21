package Facaed_Pattern;

public class client {
	public static void main( String args[] )
	{
		generalSwitchFacade gsf = new generalSwitchFacade ();
		gsf.on();
		System.out.println("----------------------");
		gsf.off();
	}
}
