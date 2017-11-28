package Iterator_Pattern;

public class Client {
	public static void display( Television tv )
	{
		TVIterator i = tv.createIterator();
		System.out.println("电视机频道：");
		while( !i.isLast() )
		{
			System.out.println(i.currentChannel().toString());
			i.next();
		}
	}


	public static void reverseDisplay( Television tv )
	{
		TVIterator i = tv.createIterator();
		i.setChannel(5);
		System.out.println("逆向遍历电视机频道：");
		while( !i.isFirst() )
		{
			i.previous();
			System.out.println(i.currentChannel().toString());
		}
	}


	public static void main( String a[] )
	{
		Television tcl;
		tcl = (Television) new TCLTelevision();

		Television skyworth;
		skyworth = (Television) new SkyworthTelevision();

		System.out.println("TCL");
		display(tcl);
		System.out.println("----------------------");
		System.out.println("TCL");
		reverseDisplay(tcl);

		System.out.println("----------------------");
		System.out.println("SkyWorth");
		display(skyworth);
		System.out.println("----------------------");
		System.out.println("SkyWorth");
		reverseDisplay(skyworth);

	}



}
