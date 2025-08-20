// Data de entrega: 21/08/2025

import java.time.LocalDate;
import java.time.DateTimeFormatter;

public class Reservation
{
    int roomNumber;
    LocalDate checkin;
    LocalDate checkout;

    public Reservation(int roomNumber, LocalDate checkin, LocalDate checkout)
    {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int duration();
    public void updateDates(LocalDate checkin, LocalDate checkout);
}
