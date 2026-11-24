package co.com.mywallet.model.notification.gateways;

import co.com.mywallet.model.notification.Notification;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Instant;
import java.util.UUID;

public interface NotificationRepository {
    Mono<Notification> save(Notification notification);
    Mono<Notification> findByIdAndUserId(UUID id, UUID userId);
    Flux<Notification> findByUserId(UUID userId);
    Mono<Void> markAllAsRead(UUID userId, Instant now);
}
