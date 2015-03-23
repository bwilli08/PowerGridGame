import java.util.ArrayList;


public class Testing {
	
	private static ArrayList<City> cities = new ArrayList<City>();
	
	public static void main(String[] args) {
		initializeCities();
		setupChicago();
		setupLA();
		setupSF();
		for(int i=0; i<cities.size(); i++)
			System.out.println(cities.get(i).toString());
	}
	
	/*
	 * Helper method to create a connection between two cities.
	 * @param start the name of the 1st city
	 * @param end the name of the 2nd city
	 * @param cost the cost of the connection
	 */
	private static void addConnection(String start, String end, int cost) {
		cities.get(cities.indexOf(new City(start))).addConnection(cities.get(cities.indexOf(new City(end))),cost);
	}
	
	public static void initializeCities() {
		//Southwest Region
		cities.add(new City("San Francisco"));
		System.out.println("Index of SF: " + cities.indexOf(new City("San Francisco")));
		cities.add(new City("Los Angeles"));
		System.out.println("Index of LA: " + cities.indexOf(new City("Los Angeles")));
		cities.add(new City("San Diego"));
		cities.add(new City("Las Vegas"));
		cities.add(new City("Phoenix"));
		cities.add(new City("Salt Lake City"));
		cities.add(new City("Santa Fe"));
		//Northwest Region
		cities.add(new City("Seattle"));
		cities.add(new City("Portland"));
		cities.add(new City("Boise"));
		cities.add(new City("Billings"));
		cities.add(new City("Cheyenne"));
		cities.add(new City("Denver"));
		cities.add(new City("Omaha"));
		//Texas Region
		cities.add(new City("Kansas City"));
		cities.add(new City("Oklahoma City"));
		cities.add(new City("Dallas"));
		cities.add(new City("Houston"));
		cities.add(new City("New Orleans"));
		cities.add(new City("Memphis"));
		cities.add(new City("Birmingham"));
		//Great Lakes Region
		cities.add(new City("Fargo"));
		cities.add(new City("Minneapolis"));
		cities.add(new City("Duluth"));
		cities.add(new City("St. Louis"));
		cities.add(new City("Chicago"));
		cities.add(new City("Cincinnati"));
		cities.add(new City("Knoxville"));
		//Northeast Region
		cities.add(new City("Detroit"));
		cities.add(new City("Buffalo"));
		cities.add(new City("Pittsburgh"));
		cities.add(new City("Boston"));
		cities.add(new City("New York"));
		cities.add(new City("Philadelphia"));
		cities.add(new City("Washington"));
		//Southeast Region
		cities.add(new City("Atlanta"));
		cities.add(new City("Norfolk"));
		cities.add(new City("Raleigh"));
		cities.add(new City("Savannah"));
		cities.add(new City("Jacksonville"));
		cities.add(new City("Tampa"));
		cities.add(new City("Miami"));
	}
	
	public static void setupChicago() {
		addConnection("Chicago", "Detroit", 7);
		addConnection("Chicago", "Cincinnati", 7);
		addConnection("Chicago", "St. Louis", 10);
		addConnection("Chicago", "Kansas City", 8);
		addConnection("Chicago", "Omaha", 13);
		addConnection("Chicago", "Minneapolis", 8);
		addConnection("Chicago", "Duluth", 12);
	}
	
	public static void setupSF() {
		addConnection("San Francisco", "Portland", 24);
		addConnection("San Francisco", "Boise", 23);
		addConnection("San Francisco", "Salt Lake City", 27);
		addConnection("San Francisco", "Las Vegas", 14);
		addConnection("San Francisco", "Los Angeles", 9);
	}
	
	public static void setupLA() {
		addConnection("Los Angeles", "San Francisco", 9);
		addConnection("Los Angeles", "San Diego", 3);
		addConnection("Los Angeles", "Las Vegas", 9);
	}
	
	public static void setupSeattle() {

	}
	
	public static void setupPortland() {
		
	}
}
