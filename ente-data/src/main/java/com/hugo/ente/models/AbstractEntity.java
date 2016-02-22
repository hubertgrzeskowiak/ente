/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hugo.ente.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (this.id == null || obj == null || !(this.getClass().equals(obj.getClass()))) {
            return false;
        }

        AbstractEntity that = (AbstractEntity) obj;
        return this.id.equals(that.getId());
    }

    @Override
    public int hashCode() {
        return id == null ? 0 : id.hashCode();
    }
}
