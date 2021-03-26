package com.example.heb.inventory.perishables.perishablesforcastingapi.perishables;

import org.springframework.stereotype.Service;

@Service
public class PerishableInventoryService {
    public PerishableInventoryForecast getPerishableInventoryByStoreIdAndPerishableId(Long storeId, Long perishableId) {
        return new PerishableInventoryForecast("lemon", perishableId, storeId,4);
    }
}
