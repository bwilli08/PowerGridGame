
public class CityConnection {
	private City city;
	private int cost;
	
	public CityConnection(City city, int cost) {
		this.setCity(city);
		this.setCost(cost);
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
}