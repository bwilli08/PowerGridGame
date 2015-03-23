
public class Player {

	private int money;
	private PowerPlant[] plants;
	
	public int getMoney() {
		return money;
	}
	
	public void addMoney(int amount) {
		money += amount;
	}
	
	public void removeMoney(int cost) throws Exception {
		if(cost>money)
			throw new Exception("not enough money");
		else
			money -=cost;
	}
	
	public PowerPlant[] getPlants() {
		return plants;
	}
	
	public void setPlants(PowerPlant[] plants) {
		this.plants = plants;
	}
}