package figures;

public class rectangle extends quadrilateral{
	
	{
		this.subType = "rectangle";
	}
	
	public rectangle(int a, int b) {

		s = new int[] { a,b,a,b};
	}
	
	public double calculateSquad() {return s[0] * s[1];};
	
}
