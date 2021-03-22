//package com.example.heb.inventory.perishables.perishablesforcastingapi.controller;
//
//import com.example.heb.inventory.perishables.perishablesforcastingapi.model.PerishableInventoryForecast;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//@WebMvcTest(PerishablesController.class)
//@AutoConfigureMockMvc
//public class PerishablesControllerTest {
//    private static final String baseURI = "/heb/inventory/forecasting/perishables";
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private PerishablesController perishablesController;
//
//    @Test
//    public void perishableInventoryApi_ShouldReturnAPerishableInventoryForecast() throws Exception {
//        PerishableInventoryForecast forecast =
//                new PerishableInventoryForecast("lemon", Long.valueOf("12345"), Long.valueOf("1"),4);
//
//        Mockito.when(perishablesController.getPerishableInventoryForecast(Mockito.anyLong(), Mockito.anyLong()))
//                .thenReturn(forecast);
//
//        this.mockMvc.perform(
//                MockMvcRequestBuilders.get(baseURI + "/store/1/perishable/12345"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().json(forecast.toString()));
//    }
//}
