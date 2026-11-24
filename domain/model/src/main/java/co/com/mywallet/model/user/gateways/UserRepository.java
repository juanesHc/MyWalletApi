package co.com.mywallet.model.user.gateways;

import co.com.mywallet.model.user.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface UserRepository {
    Mono<User> save(User user);
    Mono<User> findById(UUID id);
    Mono<User> findByEmail(String email);
    Flux<User> findAll(int page, int size);
}


