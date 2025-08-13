package Object_Oriented_Programmings;

public class Engine 
{
	private String engineType;
	private int horsePower;
	
	public Engine(String engineType, int horsePower) 
	{
		super();
		this.engineType = engineType;
		this.horsePower = horsePower;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", horsePower=" + horsePower + "]";
	}
}
