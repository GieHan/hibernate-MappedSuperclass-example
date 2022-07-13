package de.example.hibernateMappedSuperclassexample.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Producer extends User{

    private int experience;
    private String productName;

    public Producer() {
    }

    public Producer(LocalDate dateOfRegistration, String name, int experience, String productName) {
        super(dateOfRegistration, name);
        this.experience = experience;
        this.productName = productName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
