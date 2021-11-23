import java.util.*;

public class Client {
  // Data members: id, name, a list of checked out cars
  private int id;
  private String name;
  private ArrayList<Car> carsRentedOut;

  // TO-DO
  // Parametrized Constructor
  public Client(int i, String n) {
    this.id = i;
    this.name = n;
    this.carsRentedOut = new ArrayList<Car>();
  }

  // A method to return the id
  public int getID() {
    return id;
  }

  public String getName() {
    return name;
  }

  public ArrayList<Car> getCarsRentedOut() {
    return carsRentedOut;
  }

  // TO-DO
  // Need to implement this in order to have a method such as indexOf
  // work properly
  // public boolean equals(Object o) {

  // }

  // TO-DO
  // A method to rent out a car to this client by adding it to the ArrayList above
  public void rentCar(Car car) {
    this.carsRentedOut.add(car);
  }

  // TO-DO
  // List all cars of a client
  public void showStatement() {
    for (Car car : carsRentedOut) {
      System.out.println(car.toString());
    }
  }
}