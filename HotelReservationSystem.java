import java.util.Scanner;

public class HotelReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] rooms = {"Standard", "Deluxe", "Suite"};
        boolean[] booked = {false, false, false};

        int choice;

        do {
            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Rooms:");
                    for (int i = 0; i < rooms.length; i++) {
                        System.out.println((i + 1) + ". " + rooms[i] +
                                " - " + (booked[i] ? "Booked" : "Available"));
                    }
                    break;

                case 2:
                    System.out.print("Enter Room Number to Book: ");
                    int book = sc.nextInt() - 1;

                    if (book >= 0 && book < rooms.length) {
                        if (!booked[book]) {
                            booked[book] = true;
                            System.out.println("Room Booked Successfully!");
                        } else {
                            System.out.println("Room Already Booked!");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Room Number to Cancel: ");
                    int cancel = sc.nextInt() - 1;

                    if (cancel >= 0 && cancel < rooms.length) {
                        if (booked[cancel]) {
                            booked[cancel] = false;
                            System.out.println("Booking Cancelled!");
                        } else {
                            System.out.println("Room Not Booked!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
