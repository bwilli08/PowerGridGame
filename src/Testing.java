import java.util.ArrayList;


public class Testing {
	
	private static ArrayList<City> cities = new ArrayList<City>();
	
	public static void main(String[] args) {
		setup();
		for(int i=0; i<cities.size(); i++)
			System.out.println(cities.get(i).getName() + ": " + cities.get(i).getConnections().size());
	}
	
	public static void setup() {
		cities.add(new City("Chicago"));
		cities.add(new City("Detroit"));
		cities.add(new City("Cincinnati"));
		cities.add(new City("St. Louis"));
		cities.add(new City("Kansas City"));
		cities.add(new City("Omaha"));
		cities.add(new City("Minneapolis"));
		cities.add(new City("Duluth"));
		cities.get(cities.indexOf(new City("Chicago"))).addConnection(cities.get(cities.indexOf(new City("Detroit"))),7);
		cities.get(cities.indexOf(new City("Chicago"))).addConnection(cities.get(cities.indexOf(new City("Cincinnati"))),7);
		cities.get(cities.indexOf(new City("Chicago"))).addConnection(cities.get(cities.indexOf(new City("St. Louis"))),10);
		cities.get(cities.indexOf(new City("Chicago"))).addConnection(cities.get(cities.indexOf(new City("Kansas City"))),8);
		cities.get(cities.indexOf(new City("Chicago"))).addConnection(cities.get(cities.indexOf(new City("Omaha"))),13);
		cities.get(cities.indexOf(new City("Chicago"))).addConnection(cities.get(cities.indexOf(new City("Minneapolis"))),8);
		cities.get(cities.indexOf(new City("Chicago"))).addConnection(cities.get(cities.indexOf(new City("Duluth"))),12);
	}
}
