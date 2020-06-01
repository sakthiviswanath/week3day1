package week3.day1;

public class CargoShip extends Ship {
	
	public void maximumPassanger(int b) {
		System.out.println("The Max capacity is" + " " + b );
			}	

	public void cruiseCatagory(String S3) {
		System.out.println("The Cruise catagory is" + " " + S3 );
			}

 public static void main(String[] args) {
	CargoShip ship = new CargoShip();
	ship.ShipbuiltYear("IND20");
	ship.ShipbuiltYear("2000");
}


}

