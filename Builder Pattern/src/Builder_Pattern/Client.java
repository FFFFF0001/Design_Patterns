package Builder_Pattern;

public class Client {

	public static void main(String[] args) {
		ComponentBuilder cb = new BMWComponentBuilder();
		Director director = new Director();
		director.setComponentBuilder(cb);
		Component component = director.construct();
		
		System.out.println(component.getEngine());
		System.out.println(component.getSteeringWheel());
		System.out.println(component.getTyre());

	}

}
