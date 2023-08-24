package com.example.personalfinancetracker.DAO;

import com.example.personalfinancetracker.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class usersDAO {
    private final EntityManager entityManager;

    public usersDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<User> findAll(){
        TypedQuery<User> query = entityManager.createQuery("SELECT e FROM User e", User.class);
        return query.getResultList();
    }
    public User findByUsername(String username) {
        TypedQuery<User> query = entityManager.createQuery(
                "SELECT u FROM User u WHERE u.username = :username",
                User.class
        );
        query.setParameter("username", username);

        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;  // or handle exception in a manner fitting your use case
        }
    }
    public Boolean existsInDB(String username){
        User user = findByUsername(username);
        if(user==null){
            return false;
        }
        return true;
    }
    public void saveToDb(User user){

    }
}
