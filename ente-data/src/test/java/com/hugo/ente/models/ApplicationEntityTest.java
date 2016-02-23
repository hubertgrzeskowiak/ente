/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hugo.ente.models;

import org.testng.Assert;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 *
 * @author root
 */
public class ApplicationEntityTest extends PersistenceTestBase {

//    @Test
    public void testEmptyTable() {
        Application a1 = em.find(Application.class, 1);
        Assert.assertNull(a1);
    }

//    @Test(dependsOnMethods = {"testEmptyTable"})
    public void testInsert() {
        Application a1 = new Application();
        a1.setName("bananapp");
        a1.setDescription("my super sweet application!");
        em.persist(a1);
        assertTrue(em.contains(a1), "persisted entity not found through entty manager");
        Application a2 = em.find(Application.class, 1);
        assertEquals(a1, a2, "persisted entity is not equal to the one we created");
        tx.commit();
    }

//    @Test(dependsOnMethods = {"testInsert"})
    public void testCommit() {
        Application a2 = em.find(Application.class, 1);
        assertEquals(a2.getName(), "bananapp", "retrieved entity has a wrong name");
    }
}
