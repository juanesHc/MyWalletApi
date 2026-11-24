package co.com.mywallet.model.user;

import co.com.mywallet.model.user.enums.Role;
import co.com.mywallet.model.user.enums.UserStatus;
import co.com.mywallet.model.user.valueobject.IdentityDocument;
import co.com.mywallet.model.user.valueobject.Location;
import co.com.mywallet.model.user.valueobject.PhoneNumber;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;


@Getter
@Builder(toBuilder = true)
public class User {

    private final UUID id;
    private final Instant createdAt;
    private final Instant updatedAt;
    private final String name;
    private final String email;
    private final String passwordHash;
    private final IdentityDocument identityDocument;
    private final LocalDate birthDate;
    private final PhoneNumber phoneNumber;
    private final Location location;
    private final BigDecimal monthlySpendingLimit;
    private final Role role;
    private final UserStatus status;

}
