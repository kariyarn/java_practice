package cooperation;

public class Taxi {
	int money;
	
	public void take(int money) {
		this.money += money;
	}
	public void showInfo() {
		System.out.println("택시 요금은" + money + "입니다.");
	}

}
