package busReservationSystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Admin {

    Scanner scan = new Scanner(System.in);

    private final ArrayList<Bus> busList = new ArrayList<>();

    Admin() {
        busPresent();
    }

    public ArrayList<Bus> getBusList() {
        return busList;
    }

    private final String[][] busDetails = {
            {"BUS01-A1230", "true", "30", "Thirupathi", "Chennai", "3HRS", "100"},
            {"BUS02-A1241", "false", "03", "Palani", "Chennai", "8HRS", "850"},
            {"BUS03-A1532", "false", "02", "Trichy", "Chennai", "7HRS", "650"},
            {"BUS04-A1532", "true", "05", "Kerala", "Chennai", "3HRS", "950"},
            {"BUS05-A8764", "true", "04", "Pondichery", "Chennai", "3HRS", "350"}};

    static private int busCount = 1;

    private void busPresent() {
        for (String[] details : busDetails) {
            busList.add(new Bus(details[0],Boolean.parseBoolean(details[1]),Byte.parseByte(details[2]), busCount++,details[3], details[4], details[5],Double.parseDouble(details[6])));
        }
    }


    public void login(String userName, String password) {
        if (userName.equals("admin") && password.equals("admin")) {
            WHILE:
            while (true) {
                System.out.println("----Welcome Admin----");
                System.out.println("1. Add Bus\n2. Delete bus\n3. Change route\n4. Exit");
                byte option = new Scanner(System.in).nextByte();
                switch (option) {
                    case 1:
                        addBus();
                        break;
                    case 2:
                        delete();
                        break;
                    case 3:
                        changeRoute();
                        break;
                    case 4:
                        break WHILE;
                }
            }
        }
        else System.out.println("Invalid ID or Password");
    }

    private void changeRoute() {
        System.out.print("Enter Bus Number to change route : ");
        byte busNum = scan.nextByte();
        boolean flag = false;
        Bus b = new Bus();
        WHILE:
        while (!flag) {
            for (Bus bus : busList) {
                if (bus.getBusNumber() == busNum) {
                    b = bus;
                    System.out.print("Enter Starting Point : ");
                    String from = scan.next();
                    System.out.print("Enter Destination Point : ");
                    String destination = scan.next();
                    b.setSource(from);
                    b.setDestination(destination);
                    System.out.println("Changed sucessfully :)");
                    flag = true;
                    break;
                }
//                
//                
            }
            if (flag == false) System.out.println("Enter a valid Bus Number  ");
            
            
            break WHILE;
        }
        

    }

    private void delete() {
        new BookingProcess().displayBus();
        System.out.println("Enter the Bus Number to delete : ");
        WHILE:
        while (true) {
            try {
                byte busNumber = scan.nextByte();
                if (busNumber > busCount || busNumber < 1) throw new IndexOutOfBoundsException();
                for (Bus bus : busList) {
                    if (bus.getBusNumber() == busNumber) {
                        busList.remove(bus);
                        System.out.println("Deleted sucessfully");
                        break WHILE;
                    }
                }
            } catch (IndexOutOfBoundsException | InputMismatchException e) {
                System.out.println("Enter the Correct option : ");
            }
        }
    }

    private void addBus() {
        try {
            System.out.println("Enter Bus Details ");
            System.out.println("Enter Bus Number : ");
            String busNumberPlate = scan.next();
            System.out.println("A/C or Non-A/C");
            System.out.print("Enter yes or no : ");
            String AcOrNot = scan.next().toLowerCase();
            boolean category = AcOrNot.charAt(0) == 'y';
            System.out.println("Enter available seat : ");
            byte seats = scan.nextByte();
            System.out.println("Enter pickup point : ");
            String from = scan.next();
            System.out.println("Enter destination : ");
            String destination = scan.next();
            System.out.println("Time take to travel : ");
            String travelTime = scan.next();
            System.out.println("Enter cost of each ticket : ");
            double price = scan.nextDouble();
            busList.add(new Bus(busNumberPlate, category, seats,
                    busCount, from, destination, travelTime, price));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

