package figures;

public class right extends triangle{
	
	public right(int a, int b){
		super(a,b, (int) Math.sqrt(a * a + b* b));
	}
	
	{
		subType = "right";
	}
	
	public double calculateSquad() {
		
		return (int) (100 * 1.0 / 2 * s[0] * s[1]) / 100.0;
	}
	
}
