/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hugo.ente.dao;

import com.hugo.ente.models.Application;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author root
 */
@Named
@ApplicationScoped
public class ApplicationDAO {

    @PersistenceContext
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return this.em;
    }

    public void persist(Application application) {
        em.persist(application);
    }
}
