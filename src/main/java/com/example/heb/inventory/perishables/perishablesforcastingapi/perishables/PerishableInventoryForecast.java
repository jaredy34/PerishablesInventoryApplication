package com.example.heb.inventory.perishables.perishablesforcastingapi.perishables;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

@RequiredArgsConstructor
@Getter @ToString
public class PerishableInventoryForecast {
    private final @NotNull String perishableName;
    private final @NotNull Long perishableId;
    private final @Digits(integer = 12, fraction = 0) Long storeId;
    private final @Digits(integer = 5, fraction = 0) int amount;
    private final String inventoryUnitType = "pallet";
}
