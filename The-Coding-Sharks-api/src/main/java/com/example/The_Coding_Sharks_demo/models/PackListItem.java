package com.example.The_Coding_Sharks_demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class PackListItem extends AbstractEntity {

    @NotBlank(message = "Item name cannot be empty")
    private String itemName;

    @Positive(message = "Quantity must be greater than 0")
    private int quantity;

    private boolean packed;

    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;

    //constructors
    public PackListItem(String itemName, int quantity, boolean packed, Trip trip) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.packed = packed;
        this.trip = trip;
    }

    //getters and setters


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isPacked() {
        return packed;
    }

    public void setPacked(boolean packed) {
        this.packed = packed;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
}
