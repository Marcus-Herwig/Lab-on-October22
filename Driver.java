import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		GolfClub putter = new GolfClub("putter", 20);
		GolfClub SW = new GolfClub("SW", 70);
		GolfClub GW = new GolfClub("GW", 90);
		GolfClub PW = new GolfClub("PW", 100);
		GolfClub Iron9 = new GolfClub("9 Iron", 115);
		GolfClub Iron8 = new GolfClub("8 Iron", 130);
		GolfClub Iron7 = new GolfClub("7 Iron", 140);
		GolfClub Iron6 = new GolfClub("6 Iron", 150);
		GolfClub Iron5 = new GolfClub("5 Iron", 160);
		GolfClub Iron4 = new GolfClub("4 Iron", 170);
		GolfClub Iron3 = new GolfClub("3 Iron", 180);
		GolfClub Wood3 = new GolfClub("3 Wood", 200);
		GolfClub Driver = new GolfClub("Driver", 230);
		System.out.println("What is your distance?");
		Scanner input = new Scanner(System.in);
		String x = input.nextLine();
		int a =Integer.parseInt(x);
		if(a <= putter.getDistance())
		{
			putter.display();
		}
		if(a <= 80 && a > putter.getDistance())
		{
			SW.display();
		}
		if(a <= GW.getDistance() && a > 80)
		{
			GW.display();
		}
		if(a <= PW.getDistance() && a > GW.getDistance() && a < Iron9.getDistance())
		{
			PW.display();
		}
		if(a >= Iron9.getDistance() && a > PW.getDistance()&& a < Iron8.getDistance())
		{
			Iron9.display();
		}
		if(a >= Iron8.getDistance() && a > Iron9.getDistance() && a < Iron7.getDistance())
		{
			Iron8.display();
		}
		if(a >= Iron7.getDistance() && a > Iron8.getDistance() && a < Iron6.getDistance())
		{
			Iron7.display();
		}
		if(a >= Iron6.getDistance() && a > Iron7.getDistance() && a < Iron5.getDistance())
		{
			Iron6.display();
		}
		if(a >= Iron5.getDistance() && a > Iron6.getDistance() && a < Iron4.getDistance())
		{
			Iron5.display();
		}
		if(a >= Iron4.getDistance() && a > Iron5.getDistance() && a < Iron3.getDistance())
		{
			Iron4.display();
		}
		if(a >= Iron3.getDistance() && a > Iron4.getDistance() && a < Wood3.getDistance())
		{
			Iron3.display();
		}
		if(a >= Wood3.getDistance() && a > Iron3.getDistance() && a < Driver.getDistance())
		{
			Wood3.display();
		}
		if(a >= Driver.getDistance() && a > Wood3.getDistance())
		{
			Driver.display();
		}
	}

}
