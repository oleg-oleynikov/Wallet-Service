package core.repositories.transaction.repository;

import core.entities.transaction.Transaction;

public interface TransactionRepository {
    void add(Transaction transaction);
}
