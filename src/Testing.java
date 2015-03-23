import java.util.ArrayList;


public class Testing {
	
	private static ArrayList<City> cities = new ArrayList<City>();
	
	public static void main(String[] args) {
		setupBasicCities();
		setupChicago();
		for(int i=0; i<cities.size(); i++)
			System.out.println(cities.get(i).toString());
	}
	
	/*
	 * TODO: Finish creating basic cities
	 */
	public static void setupBasicCities() {
		cities.add(new City("Seattle"));
		cities.add(new City("Portland"));
		cities.add(new City("San Francisco"));
		cities.add(new City("Los Angeles"));
		cities.add(new City("San Diego"));
		cities.add(new City("Boise"));
		cities.add(new City("Las Vegas"));
		cities.add(new City("Phoenix"));
		cities.add(new City("Salt Lake City"));
		cities.add(new City("Billings"));
		cities.add(new City("Cheyenne"));
		cities.add(new City("Denver"));
		cities.add(new City("Santa Fe"));
		cities.add(new City("Fargo"));
		cities.add(new City("Oklahoma City"));
		cities.add(new City("Dallas"));
		cities.add(new City("Houston"));
		cities.add(new City("New Orleans"));
		cities.add(new City("Chicago"));
		cities.add(new City("Detroit"));
		cities.add(new City("Cincinnati"));
		cities.add(new City("St. Louis"));
		cities.add(new City("Kansas City"));
		cities.add(new City("Omaha"));
		cities.add(new City("Minneapolis"));
		cities.add(new City("Duluth"));
	}
	
	public static void setupChicago() {
		cities.get(cities.indexOf(new City("Chicago"))).addConnection(cities.get(cities.indexOf(new City("Detroit"))),7);
		cities.get(cities.indexOf(new City("Chicago"))).addConnection(cities.get(cities.indexOf(new City("Cincinnati"))),7);
		cities.get(cities.indexOf(new City("Chicago"))).addConnection(cities.get(cities.indexOf(new City("St. Louis"))),10);
		cities.get(cities.indexOf(new City("Chicago"))).addConnection(cities.get(cities.indexOf(new City("Kansas City"))),8);
		cities.get(cities.indexOf(new City("Chicago"))).addConnection(cities.get(cities.indexOf(new City("Omaha"))),13);
		cities.get(cities.indexOf(new City("Chicago"))).addConnection(cities.get(cities.indexOf(new City("Minneapolis"))),8);
		cities.get(cities.indexOf(new City("Chicago"))).addConnection(cities.get(cities.indexOf(new City("Duluth"))),12);
	}
	
	public static void setupSeattle() {

	}
	
	public static void setupPortland() {
		
	}
}
