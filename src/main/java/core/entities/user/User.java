package core.entities.user;

import core.entities.bill.Bill;

public class User {
    private static int idCounter = 0;
    private int id;
    private String username;
    private Bill bill;

    public User(int id, String username) {
        this.id = ++idCounter;
        this.username = username;
        this.bill = new Bill(0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Bill getBill() {
        return bill;
    }
}
