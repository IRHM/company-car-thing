import java.util.List;
import java.util.ArrayList;

public class Company {
  // Data members: name of the company, and a database
  private String name;
  private Database db;

  // Constructor
  public Company(String name) {
    // initialize instance variables
    this.name = name;
    this.db = new Database();
  }

  // TO-DO
  // Add a new client
  public boolean addClient(int id, String name) {
    Client client = new Client(id, name);
    return this.db.add(client);
  }

  // TO-DO
  // Rent out car plate to client clientID for price. You
  // need to verify the existence of the client first using a Database method
  // called lookUp.
  public void rentOutCar(int clientID, String plate, double price) {
    Client client = this.db.lookUp(clientID);

    // Add to cars rented out if client exists
    if (client != null) {
      Car car = new Car(plate, price);
      client.rentCar(car);
    }
  }

  // TO-DO
  // List all the clients and the average rental price for all vehicles.
  public void listClientsAndAVG() {
    for (Client client : this.db.clients) {
      List<Double> allFaresPaid = new ArrayList<Double>();

      System.out.println(client.getName());

      for (Car car : client.getCarsRentedOut()) {
        allFaresPaid.add(car.getPrice());
      }

      double faresAvg = allFaresPaid.stream().mapToDouble((a) -> a).average().getAsDouble();

      System.out.println(String.format("Average price paid: %s", faresAvg));
    }
  }
}