package com.example.heb.inventory.perishables.perishablesforcastingapi.model;

public class PerishableInventoryForecast {
    private String perishableName;
    private String storeId;
    private String perishableId;
    private int amount;
    private String inventoryUnitType = "pallet";

    public String getPerishableName() {
        return perishableName;
    }

    public void setPerishableName(String perishableName) {
        this.perishableName = perishableName;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getPerishableId() {
        return perishableId;
    }

    public void setPerishableId(String perishableId) {
        this.perishableId = perishableId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getInventoryUnitType() {
        return inventoryUnitType;
    }
}
