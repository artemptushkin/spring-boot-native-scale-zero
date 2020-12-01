package io.github.artemptushkin.springbootnativescalezero;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Component
public class HelloRouter {

	@Value("${foo.name}")
	private String name;

	@Bean
	public RouterFunction<ServerResponse> route(HelloHandler helloHandler) {
		return RouterFunctions.route(
				RequestPredicates.GET("/hello"),
				helloHandler::hello
		);
	}

	@Bean
	public RouterFunction<ServerResponse> routeHelloFromProperties(HelloHandler helloHandler) {
		return RouterFunctions.route(
				RequestPredicates.GET("/helloFromProperties"),
				r -> helloHandler.helloFromProperties(r, name)
		);
	}
}
