package me.bakuleva.coursework3.service;

import me.bakuleva.coursework3.model.Transactions;

import java.util.Collection;

public interface TransactionService {
    boolean addTransaction(Transactions transaction);

    Collection<Transactions> getAllTransactions();
}
