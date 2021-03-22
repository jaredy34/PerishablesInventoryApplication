package com.example.heb.inventory.perishables.perishablesforcastingapi.service;

import com.example.heb.inventory.perishables.perishablesforcastingapi.model.PerishableInventoryForecast;
import org.springframework.stereotype.Service;

@Service
public class PerishableInventoryService {
    public PerishableInventoryForecast getPerishableInventoryByStoreIdAndPerishableId(Long storeId, Long perishableId) {
        return new PerishableInventoryForecast("lemon", perishableId, storeId,4);
    }
}
