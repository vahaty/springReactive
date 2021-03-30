package com.curso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.EntityExchangeResult;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class ApplicationTests {

	@Autowired
	private WebTestClient webClient;

	@Test
	public void whenUserNameIsFer_thenWebFilterIsApplied() {
		EntityExchangeResult<String> result = webClient.get().uri("/users/fer").exchange().expectStatus().isOk()
				.expectBody(String.class).returnResult();

		assertEquals(result.getResponseBody(), "fer");
		assertEquals(result.getResponseHeaders().getFirst("web-filter"), "web-filter-test");
	}

	@Test
	public void whenUserNameIsTest_thenHandlerFilterFunctionIsNotApplied() {
		webClient.get().uri("/users/test").exchange().expectStatus().isOk();
	}

	@Test
	public void whenPlayerNameIsFer_thenWebFilterIsApplied() {
		EntityExchangeResult<String> result = webClient.get().uri("/players/fer").exchange().expectStatus().isOk()
				.expectBody(String.class).returnResult();

		assertEquals(result.getResponseBody(), "fer");
		assertEquals(result.getResponseHeaders().getFirst("web-filter"), "web-filter-test");
	}

	@Test
	public void whenPlayerNameIsTest_thenHandlerFilterFunctionIsApplied() {
		webClient.get().uri("/players/test").exchange().expectStatus().isForbidden();
	}
}
