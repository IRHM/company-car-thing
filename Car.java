public class Car {
  private String plate;
  private double price;

  // Constructor
  public Car(String plate, double price) {
    this.plate = plate;
    this.price = price;
  }

  // TO-DO
  // toString method
  @Override
  public String toString() {
    return String.format("Plate Number: %s Price: %s.", plate, price);
  }

  // implement getPrice method
  public double getPrice() {
    return price;
  }
}