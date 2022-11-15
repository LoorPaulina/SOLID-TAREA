package isp_solucion;

public interface SeatLockProvider {
	
	void lockSeats(Show show, List<Seat> seat, String user);
	void unlockSeats(Show show, List<Seat> seat, String user);
	
}
