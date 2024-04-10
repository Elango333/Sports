
public class StreetCricket{
	FieldingInterface fielding;
	LBWInterface lbw;

	public StreetCricket(FieldingInterface fielding, LBWInterface lbw) {
		this.fielding = fielding;
		this.lbw = lbw;
	}
	
	public void Out() {
		fielding.catchTheBall();
		lbw.lbwOut();
	}
}


