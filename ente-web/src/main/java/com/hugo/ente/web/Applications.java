/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hugo.ente.web;

import com.hugo.ente.models.Application;
import com.hugo.ente.services.ApplicationService;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author root
 */
@Named(value = "applications")
@RequestScoped
public class Applications {

    @Inject
    private ApplicationService applicationService;

    /**
     * Creates a new instance of Applications
     */
    public Applications() {
    }

    public List<Application> getAll() {
        return applicationService.getAll();
    }

    public void addOne() {
        applicationService.addOne();
    }

}
