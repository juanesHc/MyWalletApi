package co.com.mywallet.model.transaction;

import co.com.mywallet.model.transaction.valueobject.TransactionCategory;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Builder(toBuilder = true)
public class Transaction {

    private final UUID id;
    private final Instant createdAt;
    private final Instant updatedAt;

    private final UUID userId;
    private final BigDecimal amount;
    private final TransactionCategory category;
    private final String description;
    private final LocalDate date;

    public BigDecimal signedAmount() {
        return category.isExpense() ? amount.negate() : amount;
    }

}
