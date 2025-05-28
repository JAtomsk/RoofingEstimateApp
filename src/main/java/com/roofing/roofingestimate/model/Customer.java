//Defins what packages the class belongs to
package com.roofing.roofingestimate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;



@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Phone number is required")
    private String phoneNumber;

    @NotBlank(message = "Address is required")
    private String address;

    @Email(message = "Invalid email address")
    @NotBlank(message = "Email is required")
    private String email;

    @Min(value = 1, message = "Roof size must be at least 1 square")
    private double roofSizeInSquares;

    @Min(value = 1, message = "Price per square must be at least 1")
    private double pricePerSquare;

    @NotNull(message = "Total estimate is required")
    private double totalEstimate;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getRoofSizeInSquares() {
        return roofSizeInSquares;
    }

    public void setRoofSizeInSquares(double roofSizeInSquares) {
        this.roofSizeInSquares = roofSizeInSquares;
    }

    public double getPricePerSquare() {
        return pricePerSquare;
    }

    public void setPricePerSquare(double pricePerSquare) {
        this.pricePerSquare = pricePerSquare;
    }

    public double getTotalEstimate() {
        return totalEstimate;
    }

    public void setTotalEstimate(double totalEstimate) {
        this.totalEstimate = totalEstimate;
    }
}
