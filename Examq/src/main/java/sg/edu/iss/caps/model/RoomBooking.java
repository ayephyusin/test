package sg.edu.iss.caps.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class RoomBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int floor;
    private String guestName;
    private String guestSurname;
    private RoomState roomState;
    private Date bookingFrom;
    private Date bookingTo;
    private Date bookingDate;
    @OneToOne
    private Payment payment;
}
