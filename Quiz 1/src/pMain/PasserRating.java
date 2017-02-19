package pMain;

public class PasserRating {

	private double Touchdowns;
	private double Yards;
	private double Interceptions;
	private double Completions;
	private double Attempted;
	
	public PasserRating(double touchdowns, double yards, double interceptions, double completions, double attempted) {
		super();
		Touchdowns = touchdowns;
		Yards = yards;
		Interceptions = interceptions;
		Completions = completions;
		Attempted = attempted;
	}

	public double getTouchdowns() {
		return Touchdowns;
	}
	public void setTouchdowns(double touchdowns) {
		Touchdowns = touchdowns;
	}
	public double getYards() {
		return Yards;
	}
	public void setYards(double yards) {
		Yards = yards;
	}
	public double getInterceptions() {
		return Interceptions;
	}
	public void setInterceptions(double interceptions) {
		Interceptions = interceptions;
	}
	public double getCompletions() {
		return Completions;
	}
	public void setCompletions(double completions) {
		Completions = completions;
	}
	public double getAttempted() {
		return Attempted;
	}
	public void setAttempted(double attempted) {
		Attempted = attempted;
	}
	
	public double Rating(){
		
		double a;
		a = ((Completions / Attempted) - .3) * 5;
		double b;
		b = ((Yards / Attempted) - 3) * .25;
		double c;
		c = (Touchdowns / Attempted) * 20;
		double d;
		d = 2.375 - ((Interceptions / Attempted) * 25);
	
		double PR = (((a + b + c + d) / 6) * 100);
		return PR;
				
	}
}
