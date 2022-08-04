package figures;

public abstract class figure {
	//variables
	protected String type;
	protected double squad;
	protected double perimeter;
	
	//geters
	public String getType() { return type; }
	public double getSquad() { return squad; }
	public double getPerimeter() { return perimeter; }
	
	//seters
	public void setType(String type) { this.type = type; }
	public void setSquad(double squad) {this.squad = squad; }
	public void setPerimeter(double perimeter) {this.perimeter = perimeter;}
	
	
}
