package figures;

public abstract class figure {
	//variables
	protected String type = "None";
	protected String subType = "None";
	
	//geters
	public String getType() { return type; }
	
	//seters
	public void setType(String type) { this.type = type; }
	
	//functions
	public void print() {}
	public double calculateSquad() {return 0;};
	public int calculatePerimeter() {return 0;}
}
