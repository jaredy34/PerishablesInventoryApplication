package com.example.heb.inventory.perishables.perishablesforcastingapi.controller;

import com.example.heb.inventory.perishables.perishablesforcastingapi.model.PerishableInventoryForecast;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class PerishablesController {

    @GetMapping("/store/{storeId}/perishable/{perishableId}")
    public PerishableInventoryForecast getPerishableInventoryForecast(@PathVariable String storeId, @PathVariable String perishableId) {
        PerishableInventoryForecast forecast = new PerishableInventoryForecast();

        forecast.setPerishableId(perishableId);
        forecast.setPerishableName("lemon");
        forecast.setStoreId(storeId);
        forecast.setAmount(4);

        return forecast;
    }
}
