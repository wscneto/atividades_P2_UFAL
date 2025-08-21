// Data de entrega: 21/08/2025

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        int roomNumber;
        LocalDate checkin;
        LocalDate checkout;

        System.out.print("Room number: ");
        roomNumber = sc.nextInt();

        System.out.print("Check-in date (dd/MM/yyyy): ");
        checkin = LocalDate.parse(sc.next(), fmt);

        System.out.print("Check-out date (dd/MM/yyyy): ");
        checkout = LocalDate.parse(sc.next(), fmt);

        try
        {
            Reservation res = new Reservation(roomNumber, checkin, checkout);
            System.out.println(res);

            System.out.println();
            System.out.println("Enter data to update the reservation:");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkin = LocalDate.parse(sc.next(), fmt);

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkout = LocalDate.parse(sc.next(), fmt);
        
            res.updateDates(checkin, checkout);
            System.out.println(res);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
