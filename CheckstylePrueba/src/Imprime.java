
public class Imprime {
	
	private int X;
	private int Y;
	public Imprime(int X, int Y) {
		this.X=X;
		this.Y=Y;
		System.out.println("X: " + X + " Y: "+ Y);
	}
	
	public int GetX() {
		return X;
	}
}
