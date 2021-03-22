package com.example.heb.inventory.perishables.perishablesforcastingapi.controller;

import com.example.heb.inventory.perishables.perishablesforcastingapi.model.PerishableInventoryForecast;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Digits;

@RestController()
public class PerishablesController {

    @GetMapping("/store/{storeId}/perishable/{perishableId}")
    public PerishableInventoryForecast getPerishableInventoryForecast(
            @PathVariable @Digits(integer = 9, fraction = 0) Long storeId,
            @PathVariable @Digits(integer = 9, fraction = 0) Long perishableId) {
        return new PerishableInventoryForecast("lemon", perishableId, storeId,4);
    }
}
