public class GolfClub 
{
	private String name;
	private int distance;
	
	GolfClub(String name, int x) 
	{
		this.name = name;
		this.distance = x;
	}
	public void display()
	{
		System.out.println("Club: " + this.name + " " + this.distance);
	}
	public String getName()
	{
		return this.name;
	}
	public int getDistance()
	{
		return this.distance;
	}
}