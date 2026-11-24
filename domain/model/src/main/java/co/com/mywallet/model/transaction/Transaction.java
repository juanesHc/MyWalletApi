package co.com.mywallet.model.transaction;

import co.com.mywallet.model.transaction.enums.ExpenseCategory;
import co.com.mywallet.model.transaction.enums.TransactionType;
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
    private final TransactionType type;
    private final BigDecimal amount;
    private final ExpenseCategory expenseCategory;
    private final String description;
    private final LocalDate date;

}
