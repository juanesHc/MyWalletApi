package co.com.mywallet.model.user.gateways;

import reactor.core.publisher.Mono;

public interface PasswordEncoderGateway {
    Mono<String> encode(String rawPassword);
    Mono<Boolean> matches(String rawPassword, String passwordHash);
}
