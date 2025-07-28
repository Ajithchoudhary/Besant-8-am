Ticket Booking System (Java)
Features
- Add a new passenger with:
     - Name
     - Berth Preference (Upper, Lower, Middle)
     - Passenger ID
- Allocate berths based on availability.
- Maintain a **waiting list** if all berths are full.
- Display all booked passengers and waiting list.

Work flow:
1. User enters passenger details.
2. The system checks berth availability:
   - If preferred berth is available → allocate it.
   - Else → allocate any available berth.
   - If no berths available → add passenger to waiting list.
3. Display all bookings and waiting passengers.

Technologies Used
- Java Core
- Enums (for berth types)
- Collections (for storing passengers)
- Encapsulation
