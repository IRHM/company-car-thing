public class Tester {
  public static void main(String[] args) {
    // Create a company
    Company company = new Company("VIP Rental");

    // Add a new client
    company.addClient(111, "Dave Johnson");

    // If you try to insert the same client with the same id, it will return false
    System.out.println(company.addClient(111, "Dave Johnson"));

    // Rent out some cars
    // Renting out vehicle #23432 to client 111 for a certain price
    company.rentOutCar(111, "#23432", 26);
    company.rentOutCar(111, "#13652", 200);
    company.rentOutCar(111, "#12224", 52);

    // List all clients of the company and the average rental price a car in the
    // company.
    company.listClientsAndAVG();
  }
}