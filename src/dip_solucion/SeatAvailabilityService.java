package dip_solucion;

public class SeatAvailabilityService {
	private BookingService bookingService;
	private SeatLockProvider seatLockProvider;
	
	
    public SeatAvailabilityService(BookingService bookingService,SeatLockProvider seatLockProvider) {
    	  this.bookingService = bookingService;
          this.seatLockProvider = seatLockProvider;
}
    
    //implementacion
    
}

