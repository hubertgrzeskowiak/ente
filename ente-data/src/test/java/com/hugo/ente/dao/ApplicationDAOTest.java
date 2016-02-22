/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hugo.ente.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CdiRunner.class)
public class ApplicationDAOTest {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
    EntityManager em = emf.createEntityManager();

    @Inject
    ApplicationDAO dao;

    @Test
    public void testDI() {
        System.out.println(dao);
        System.out.println(dao.getEntityManager());

    }

}
