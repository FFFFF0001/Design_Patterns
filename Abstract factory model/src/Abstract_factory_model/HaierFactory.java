package Abstract_factory_model;

public class HaierFactory implements EFactory {

	@Override
	public Television produceTelevision() {
		// TODO Auto-generated method stub
		return new HaierTelevision();
	}

	@Override
	public AirConditioner produceAirConditioner() {
		// TODO Auto-generated method stub
		return new HaierAirConditioner();
	}

}
