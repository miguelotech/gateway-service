package com.synopsis.gateway;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GatewayServiceApplicationTests {

	@Test
	void applicationClassIsLoadable() {
		assertThat(new GatewayServiceApplication()).isNotNull();
	}
}
