package base.filter;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

@Component
public class RouteValidater {

	public static final List<String> OPEN_ENDPOINTS = List.of("/auth/", "/auth/**", "/eureka", "/api-docs");

	public Predicate<ServerHttpRequest> isSecured = req -> OPEN_ENDPOINTS.stream()
			.noneMatch(uri -> req.getURI().getPath().contains(uri));

}
