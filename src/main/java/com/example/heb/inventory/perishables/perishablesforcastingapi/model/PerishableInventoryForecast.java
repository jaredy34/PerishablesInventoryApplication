package com.example.heb.inventory.perishables.perishablesforcastingapi.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter @ToString
public class PerishableInventoryForecast {
    private final String perishableName;
    private final Long perishableId;
    private final Long storeId;
    private final int amount;
    private final String inventoryUnitType = "pallet";
}
