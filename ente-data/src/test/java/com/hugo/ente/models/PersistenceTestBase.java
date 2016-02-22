/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hugo.ente.models;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public abstract class PersistenceTestBase {

    protected EntityManagerFactory emf;
    protected EntityManager em;
    protected EntityTransaction tx;

    @BeforeClass
    public void beforeClass() {
        emf = Persistence.createEntityManagerFactory("test");
        em = emf.createEntityManager();
    }
    
    @BeforeMethod
    public void beforeMethod() {
        tx = em.getTransaction();
        tx.begin();
    }
    
    @AfterMethod
    public void afterMethod() {
        if (tx.isActive()) {
            tx.rollback();
        }
    }

    @AfterClass
    public void afterClass() {
        em.close();
        emf.close();
    }
}
