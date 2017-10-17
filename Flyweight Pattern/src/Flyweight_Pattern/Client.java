package Flyweight_Pattern;
//享元模式之共享艺术家（无外部状态）

public class Client {

	public static void main(String[] args) {
		Artist nd1,nd2,nd3,nd4,nd5;
		ArtistFactory df = new ArtistFactory();
		
		nd1 = df.getAtrises("王菲");
		nd1.Info();
		
		nd2 = df.getAtrises("王菲");
		nd2.Info();
		
		nd3 = df.getAtrises("王菲");
		nd3.Info();
		
		nd4 = df.getAtrises("刘德华");
		nd4.Info();
		
		nd5 = df.getAtrises("刘德华");
		nd5.Info();
		
		System.out.println( "艺术家人数为:" + df.getTotalAtrises() );
		System.out.println( "CD唱片总数为:" + df.getTotalCD() );

	}

}
