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
            {"1", "true", "30", "Thirupathi", "Chennai","3HRS","100"},
            {"2", "false", "03", "Palani", "Chennai", "8HRS","850"},
            {"3", "false", "02", "Trichy", "Chennai", "7HRS","650"},
            {"4", "true", "05", "Kerala", "Chennai", "3HRS","950"},
            {"5", "true", "04", "Pondichery", "Chennai", "3HRS","350"}};

    static private int busCount = 1;

    private void busPresent() {
        for (String[] details : busDetails) {
            busList.add(new Bus(details[0],Boolean.parseBoolean(details[1]),Byte.parseByte(details[2]), busCount++,details[3], details[4], details[5], Double.parseDouble(details[6])));
        }
    }


    public void login(String userName, String password) {
        if (userName.equals("admin") && password.equals("admin")) {
            WHILE:
            while (true) {
                System.out.println("----Welcome Admin----");
                System.out.println("1. Add Bus\n2. Delete bus\n3. Change route\n4. Display Bus Details\n5. Exit");
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
                    	displayBus();
                    	break;
                    case 5:
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
               
            }
            if (flag == false) System.out.println("Enter a valid Bus Number  ");
            
            
            break WHILE;
        }
        

    }

    private void delete() {
        displayBus();
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
            System.out.println("Enter number Stops in middle :");
            int numberOfStops = scan.nextInt();
            System.out.println("Enter  Stop names :");
            String stops = null;
            for(int i =0 ; i< numberOfStops ; i++ ) {
            	 stops=scan.next();
            }
            busList.add(new Bus(busNumberPlate, category, seats,busCount, from, destination, travelTime, price));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void displayBus() {
        System.out.println(" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-7s| %-19s| %-19s| %-15s| %-18s| %-18s| %-18s| %-10s|%n", "BUS NO", "BUS", "AVAILABLE TICKETS", "CATEGORY", "FROM", "TO", "TRAVEL TIME", "COST");
        System.out.println(" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Bus busList : getBusList())
            System.out.printf("| %-7s| %-19s| %-19s| %-15s| %-18s| %-18s| %-18s| %-10s|%n", busList.getBusNumber(), busList.getBusNumberPlate(),
                    (busList.getSeats() < busList.getAvailableSeats() ? busList.getSeats() : busList.getAvailableSeats()),
                    (busList.isAC() ? "A/C" : "N-A/C"), busList.getSource(), busList.getDestination(), busList.getTravelTime(), busList.getTicketCost());
        System.out.println(" --------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}

