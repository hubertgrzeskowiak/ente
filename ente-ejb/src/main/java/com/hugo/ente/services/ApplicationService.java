/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hugo.ente.services;

import com.hugo.ente.dao.ApplicationDAO;
import com.hugo.ente.models.Application;
import java.util.List;
import java.util.Random;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

/**
 *
 * @author martin
 */
@Stateless
@Named
public class ApplicationService {

    @Inject
    ApplicationDAO applicationDAO;

    @Transactional
    public List<Application> getAll() {
        return applicationDAO.getAll();
    }

    @Transactional
    public void addOne() {
        Application application = new Application();
        String rand = String.valueOf(new Random().nextInt(10000));
        application.setName("application" + rand);
        applicationDAO.persist(application);
    }
}
