public class Driver {
  public static void main(String[] args) {
    Company company = new Company("VIP Rental");

    company.addClient(1, "Bob Jones");

    company.rentCar(1, "AB28372", 25);

    RentingStats stats = company.getPresentingRentingStats();
    System.out.println(stats.getAvgFare());
  }
}
