package core.entities.transaction;

import java.util.UUID;

public class Transaction {
    private UUID uuid;
    private int sumTransaction;
    private TransactionStatus transactionStatus;

    public Transaction(int sumTransaction) {
        this.uuid = UUID.randomUUID();
        this.sumTransaction = sumTransaction;
        this.transactionStatus = TransactionStatus.PENDING;
    }

    public UUID getUuid() {
        return uuid;
    }

    public int getSumTransaction() {
        return sumTransaction;
    }

    public TransactionStatus getTransactionStatus(){
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus){
        this.transactionStatus = transactionStatus;
    }
}
