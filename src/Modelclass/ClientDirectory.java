package Modelclass;

import java.util.ArrayList;
import java.util.List;

/**
 * Directory for managing Clients.
 */
public class ClientDirectory {
    private List<Client> clients;

    public ClientDirectory() {
        this.clients = new ArrayList<>();
        // Initialize with default clients if needed
        initializeDefaultClients();
    }

    // Add a client to the directory
    public void addClient(Client client) {
        // Check if username already exists in the directory
        for (Client existingClient : clients) {
            if (existingClient.getUsername().equalsIgnoreCase(client.getUsername())) {
                throw new IllegalArgumentException("Client with this username already exists. Choose another.");
            }
        }
        clients.add(client);
    }

    // Delete a client from the directory
    public void deleteClient(Client client) {
        clients.remove(client);
    }

    // Search client by username
    public Client searchClientByName(String name) {
        for (Client client : clients) {
            if (client.getName().equalsIgnoreCase(name)) {
                return client;
            }
        }
        return null;  // Return null if no match is found
    }

    // Retrieve all clients
    public List<Client> getAllClients() {
        return clients;
    }

    // Display all clients as a string
    public String displayClients() {
        StringBuilder sb = new StringBuilder();
        for (Client client : clients) {
            sb.append(client.toString()).append("\n");
        }
        return sb.toString();
    }

    // Initialize default clients for testing
    private void initializeDefaultClients() {
        // Adding some default clients for testing or initial setup
        addClient(new Client("C001", "John Doe", "1234 Elm Street", "555-1234", "john", "123"));
        addClient(new Client("C002", "Jane Doe", "5678 Oak Avenue", "555-5678", "jane", "456"));
    }

    // Authenticate a client by username and password
    public Client authenticateClient(String username, String password) {
        for (Client client : clients) {
        // Ensure case-insensitive comparison for username
        if (client.getUsername().equalsIgnoreCase(username) && client.getPassword().equals(password)) {
            return client;  // Successfully authenticated
        }
    }
    return null;   // Authentication failed if no match found
    }
}
