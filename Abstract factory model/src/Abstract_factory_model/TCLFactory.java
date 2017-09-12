package Abstract_factory_model;

public class TCLFactory implements EFactory {

	@Override
	public Television produceTelevision() {
		// TODO Auto-generated method stub
		return new TCLTelevision();
	}

	@Override
	public AirConditioner produceAirConditioner() {
		// TODO Auto-generated method stub
		return new TCLAirConditioner();
	}

}
