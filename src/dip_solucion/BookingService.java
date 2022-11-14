package dip_solucion;

public interface BookingService {
	Booking getBooking();
	List<Booking> getAllBookings(Show show);
	Booking createBooking();
	void getBookedSeats();
	void confirmBooking();
	boolean isAnySeatAlreadyBooked();
}
