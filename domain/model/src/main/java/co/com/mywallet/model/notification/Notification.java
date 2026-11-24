package co.com.mywallet.model.notification;

import co.com.mywallet.model.notification.enums.NotificationType;
import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Builder(toBuilder = true)
public class Notification {

    private final UUID id;
    private final Instant createdAt;
    private final Instant updatedAt;
    private final UUID userId;
    private final NotificationType type;
    private final String message;
    private final Instant readAt;
}
