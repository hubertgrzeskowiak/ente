//
// This file was generated by the JPA Modeler
//
package com.hugo.ente.models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity

public class HostMachine extends AbstractEntity implements Serializable {

    @Basic
    private String domainName;

    @Basic
    private String ipAddress;

    @ManyToMany(targetEntity = Application.class, mappedBy = "hostMachines")
    private Set<Application> applications;

    public String getDomainName() {
        return this.domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Set<Application> getApplications() {
        return this.applications;
    }

    public void setApplications(Set<Application> applications) {
        this.applications = applications;
    }
}