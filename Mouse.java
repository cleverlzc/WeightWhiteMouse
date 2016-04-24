package huawei;

public class Mouse {
	public int weight;
	public MOUSE_COLOR color;	
	public Mouse()
	{
		
	}
	public Mouse(int weight,MOUSE_COLOR color)
	{
		this.weight =weight;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Mouse [weight=" + weight + ", color=" + color + "]";
	}
}
