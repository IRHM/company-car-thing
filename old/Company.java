import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Company {
  private String title;
  private List<Client> clientRecords = new ArrayList<Client>();
  private List<RentingClient> clientsPrensentingRenting = new ArrayList<RentingClient>();

  public Company(String t) {
    title = t;
  }

  public boolean addClient(int id, String name) {
    Client client = new Client(id, name);

    if (clientRecords.contains(client)) {
      return false;
    } else {
      clientRecords.add(client);
      return true;
    }
  }

  // Present renting a car
  public void rentCar(int clientId, String plate, int fare) {
    RentingClient rc = new RentingClient(clientId, plate, fare);
    clientsPrensentingRenting.add(rc);
  }

  public RentingStats getPresentingRentingStats() {
    List<Client> clients = new ArrayList<Client>();
    List<Integer> fares = new ArrayList<Integer>();

    for (RentingClient rclient : clientsPrensentingRenting) {
      clients.add(findClientById(rclient.getId()));
      fares.add(rclient.getFare());
    }

    IntSummaryStatistics fareStats = fares.stream().mapToInt((a) -> a).summaryStatistics();

    RentingStats rs = new RentingStats(clients, fareStats.getAverage());
    return rs;
  }

  public Client findClientById(int clientId) {
    Client matchingClient = null;

    for (Client client : clientRecords) {
      if (client.getId() == clientId) {
        matchingClient = client;
        break;
      }
    }

    return matchingClient;
  }
}
