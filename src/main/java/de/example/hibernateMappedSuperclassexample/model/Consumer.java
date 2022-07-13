package de.example.hibernateMappedSuperclassexample.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Consumer extends User{

    private int balance;
    private String productWishName;

    public Consumer() {
    }

    public Consumer(LocalDate dateOfRegistration, String name, int balance, String productWishName) {
        super(dateOfRegistration, name);
        this.balance = balance;
        this.productWishName = productWishName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getProductWishName() {
        return productWishName;
    }

    public void setProductWishName(String productWishName) {
        this.productWishName = productWishName;
    }
}
