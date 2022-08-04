package figures;

public class triangle extends figure {
	
	protected int[] s;
	
	{
		this.type = "triangle";
	}
	
	public triangle(int a, int b, int c) {
		s = new int[] {a,b,c};
	}
	
	public void print() {
		System.out.println("a = " + s[0] + ", b = " + s[1] + ", c = " + s[2]);
		System.out.println("squad = " + this.calculateSquad() + ", perimeter = " + this.calculatePerimeter());
		System.out.println("type = " + this.type + ", sub type = " + this.subType);
	}
	
	public double calculateSquad() {
		double p = (s[0] + s[1] + s[2]) / 2.0;
		
		return (int) (100 *Math.sqrt(p * (p - s[0]) * (p - s[1]) * (p - s[2]))) / 100.0;
	}
	
	public int calculatePerimeter() {
		return s[0] + s[1] + s[2];
	}
	
}
