package com.synopsis.gateway.controller;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class HealthControllerTest {

    private final HealthController controller = new HealthController();

    @Test
    void healthEndpointReturnsUpStatus() {
        Map<String, String> response = controller.health();

        assertThat(response).containsEntry("status", "UP");
    }
}
