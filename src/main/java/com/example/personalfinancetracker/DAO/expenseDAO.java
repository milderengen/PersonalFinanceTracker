package com.example.personalfinancetracker.DAO;
import com.example.personalfinancetracker.models.Expense;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class expenseDAO {
    private final EntityManager entityManager;
    public expenseDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public List<Expense> findall(){
        TypedQuery<Expense> query = entityManager.createQuery("SELECT e FROM Expense e", Expense.class);
        return query.getResultList();
    }
}
