package com.test.person;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Rafi on 13/09/2016.
 */

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class PersonRepositoryImpl implements PersonRepository{

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public void fun() {
        System.out.println(entityManager);
    }
}
