import java.util.List;

public class RentingStats {
  private List<Client> clients;
  private double averageFare;

  public RentingStats(List<Client> c, double af) {
    clients = c;
    averageFare = af;
  }

  public double getAvgFare() {
    return averageFare;
  }

  public List<Client> getClients() {
    return clients;
  }
}
