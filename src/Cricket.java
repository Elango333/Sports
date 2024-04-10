
public class Cricket implements OutdoorGamesInterface{

	public void goForToss() {
		System.out.println("Toss");
	}
	
	public void chooseBattingOrBowling() {
		System.out.println("Choose Batting or Bowling");
	}

	@Override
	public void wearSportsShoe() {
		System.out.println("Wear sports shoe");
	}

	@Override
	public void doingWarmups() {
		System.out.println("Doing warmups");
	}
}
