package com.example.heb.inventory.perishables.perishablesforcastingapi.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PerishableInventoryForecast {
    private final String perishableName;
    private final String storeId;
    private final String perishableId;
    private final int amount;
    private final String inventoryUnitType = "pallet";
}
