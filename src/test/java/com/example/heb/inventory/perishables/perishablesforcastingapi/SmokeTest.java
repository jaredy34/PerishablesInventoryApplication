package com.example.heb.inventory.perishables.perishablesforcastingapi;

import com.example.heb.inventory.perishables.perishablesforcastingapi.perishables.PerishablesController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {
    @Autowired
    private PerishablesController perishablesController;

    @Test
    public void contextLoads() {
        Assertions.assertThat(perishablesController).isNotNull();
    }
}
