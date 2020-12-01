package io.github.artemptushkin.springbootnativescalezero;

import reactor.core.publisher.Mono;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import static java.text.MessageFormat.format;

@Component
public class HelloHandler {

	public Mono<ServerResponse> hello(ServerRequest serverRequest) {
		return ServerResponse
				.ok()
				.contentType(MediaType.TEXT_PLAIN)
				.body(BodyInserters.fromValue("Hello from spring boot native!"));
	}

	public Mono<ServerResponse> helloFromProperties(ServerRequest serverRequest, String name) {
		return ServerResponse
				.ok()
				.contentType(MediaType.TEXT_PLAIN)
				.body(BodyInserters.fromValue(format("Hello {0} from spring boot native!", name)));
	}
}
