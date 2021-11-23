public class RentingClient {
  private int id;
  private String plate;
  private int fare;

  public RentingClient(int i, String p, int f) {
    id = i;
    plate = p;
    fare = f;
  }

  public int getId() {
    return id;
  }

  public int getFare() {
    return fare;
  }
}
