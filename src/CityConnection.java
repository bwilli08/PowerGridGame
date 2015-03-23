
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
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof CityConnection))
			return false;
		if(obj == this)
			return true;
		CityConnection temp = (CityConnection) obj;
		return temp.getCity().equals(this.getCity());
	}
	
	@Override
	public String toString() {
		return "(" + city.getName() + ", $" + cost + ")";
	}
}