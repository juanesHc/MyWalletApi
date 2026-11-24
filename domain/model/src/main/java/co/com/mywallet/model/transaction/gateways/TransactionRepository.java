package co.com.mywallet.model.transaction.gateways;

import co.com.mywallet.model.transaction.Transaction;
import co.com.mywallet.model.transaction.enums.TransactionType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.UUID;

public interface TransactionRepository {
    Mono<Transaction> save(Transaction transaction);
    Mono<Transaction> findByIdAndUserId(UUID id, UUID userId);
    Flux<Transaction> findByUserId(UUID userId, TransactionType type,
                               LocalDate from, LocalDate to);
    Mono<Void> deleteByIdAndUserId(UUID id, UUID userId);
}
