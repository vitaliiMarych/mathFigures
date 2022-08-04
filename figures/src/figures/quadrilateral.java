package figures;

public abstract class quadrilateral extends figure{
	
	protected int[] s;
	
	{
		this.type = "quadrilateral";
	}
	
	public void print() {
		
		System.out.print("a = " + s[0] + ", b = " + s[1] + ", c = " + s[2] + ", d = " + s[3]);
		super.print();
	}
	
	public int calculatePerimeter() {
		return s[0] + s[1] + s[2] + s[3];
	}
	
	
}
