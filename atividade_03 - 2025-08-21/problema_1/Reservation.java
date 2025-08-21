// Data de entrega: 21/08/2025

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation
{
    int roomNumber;
    LocalDate checkin;
    LocalDate checkout;
    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(int roomNumber, LocalDate checkin, LocalDate checkout)
    {
        if(checkin.isAfter(checkout))
        {
            throw new IllegalArgumentException("Error in reservation: Check-out date must be after check-in date");
        }

        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public long duration() // ChronoUnit returns long...
    {
        return ChronoUnit.DAYS.between(checkin, checkout);
    }

    public void updateDates(LocalDate checkin, LocalDate checkout)
    {
        if(checkin.isBefore(LocalDate.now()) || checkout.isBefore(LocalDate.now()))
        {
            throw new IllegalArgumentException("Error in reservation: Reservation dates for update must be future dates");
        }
        else if(checkin.isAfter(checkout))
        {
            throw new IllegalArgumentException("Error in reservation: Check-out date must be after check-in date");
        }

        this.checkin = checkin;
        this.checkout = checkout;
    }

    @override
    public String toString()
    {
        return "Reservation: Room " + this.roomNumber + ", check-in: " + checkin.format(fmt) + ", checkout: " + checkout.format(fmt) + ", " + duration() + " nights";
    }
}
