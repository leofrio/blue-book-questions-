package challenge17;

public class call {
	private int bhour;
	private double bmin;
	private int fhour;
	private double fmin;  
	private double minvalue;
	private double totaltimeb;
	private double totaltimef; 
	
	public double getMinvalue() {
		return minvalue;
	}
	public void setMinvalue(double minvalue) {
		this.minvalue = minvalue;
	}
	public int getBhour() {
		return bhour;
	}
	public void setBhour(int bhour) {
		this.bhour = bhour;
	}
	public double getBmin() {
		return bmin;
	}
	public void setBmin(double bmin) {
		this.bmin = bmin;
	}
	public int getFhour() {
		return fhour;
	}
	public void setFhour(int fhour) {
		this.fhour = fhour;
	}
	public double getFmin() {
		return fmin;
	}
	public void setFmin(double fmin) {
		this.fmin = fmin;
	}
	public void setTimeTotalb(int h,double m) { 
		this.totaltimeb=h+m;
	} 
	public void setTimeTotalf(int h,double m) { 
		this.totaltimef=h+m;
	}
	public double getTotaltimeb() {
		return totaltimeb;
	}
	public double getTotaltimef() {
		return totaltimef;
	}
	
}
