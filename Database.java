import java.util.*;

public class Database {
  // Declare an ArrayList of clients
  public ArrayList<Client> clients;

  // Constructor
  public Database() {
    this.clients = new ArrayList<Client>();
  }

  // TO-DO
  // A method that adds a client. It returns false if the
  // client already exists, otherwise it returns true.
  // You should use the lookUp method below.
  public boolean add(Client p) {
    if (lookUp(p.getID()) != null) {
      // Return false since client already exists
      return false;
    } else {
      this.clients.add(p);
      return true;
    }
  }

  // TO-DO
  // A helper method to look for a client using id. If found, it returns it,
  // otherwise it returns a null.
  public Client lookUp(int id) {
    try {
      // return client if one is found
      return clients.stream().filter(client -> client.getID() == id).findFirst().get();
    } catch (NoSuchElementException err) {
      // Returns error if no element found, so just return null.
      return null;
    }
  }
}