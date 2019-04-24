package Reservations;

public class Reservation implements Reservationy {

	int hashCode = 8;

	@Override
	public String getDowBooking() {
		String[] Dow = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		return Dow[(int)(Math.random() * Dow.length)];
	}

	@Override
	public String getCodeBooking(int hashCode) {
		String hashOptions = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String hashedString = "";
		for (int i = 0; i < hashCode; i++) {
			char symbol = hashOptions.charAt((int)(Math.random() * hashOptions.length()));
			hashedString += symbol;
		}
		return hashedString;
	}

	@Override
	public void printBooking() {
		System.out.println("Booking# " + getCodeBooking(hashCode) + " for " + getDowBooking());
	}
}
