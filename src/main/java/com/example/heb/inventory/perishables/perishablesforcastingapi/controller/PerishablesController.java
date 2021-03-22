package com.example.heb.inventory.perishables.perishablesforcastingapi.controller;

import com.example.heb.inventory.perishables.perishablesforcastingapi.model.PerishableInventoryForecast;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class PerishablesController {

    @GetMapping("/store/{storeId}/perishable/{perishableId}")
    public PerishableInventoryForecast getPerishableInventoryForecast(@PathVariable String storeId,
                                                                      @PathVariable String perishableId) {
        return new PerishableInventoryForecast("lemon", storeId, perishableId, 4);
    }
}
