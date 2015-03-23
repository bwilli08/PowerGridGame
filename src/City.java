import java.util.ArrayList;


public class City {

	private String name;
	private Integer[] cost = {10, 15, 20};
	private ArrayList<Player> connected;
	private ArrayList<CityConnection> connections;

	public City(String name) {
		this.name = name;
		connected = new ArrayList<Player>();
		connections = new ArrayList<CityConnection>();
	}

	public void addConnection(City city, int cost) {
		if(!this.isConnected(city)) {
			connections.add(new CityConnection(city, cost));
			if(!city.isConnected(this)) {
				city.addSecondConnection(this, cost);
			}
		}
	}
	
	private void addSecondConnection(City city, int cost) {
		connections.add(new CityConnection(city, cost));
	}

	public ArrayList<CityConnection> getConnections() {
		return connections;
	}
	
	public boolean isConnected(City city) {
		return connections.contains(new CityConnection(city, 0));
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof City))
			return false;
		if(obj == this)
			return true;
		City temp = (City) obj;
		return temp.getName().equals(name);
	}
	
	@Override
	public String toString() {
		String temp = "{" + name + ": ";
		for(int i=0; i<connections.size(); i++) {
			temp = temp + connections.get(i).toString();
		}
		return temp + "}";
	}
}